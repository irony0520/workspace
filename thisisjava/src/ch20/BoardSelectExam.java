package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Blob;

public class BoardSelectExam {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thisisjava",  
					"java",
					"1234"     //username, password, 외부에서 접속할시 localhost부분에 특정아이피 입력가능
					);
			
			System.out.println("연결 성공");
			String sql = """
					select *
					from boards
					where bwriter=?					
					""";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			ResultSet rs = pstmt.executeQuery();
			List<Board> list = new ArrayList<>();
			while(rs.next()) {
				Board board = new Board(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getDate(5),
						rs.getString(6),
						rs.getBlob(7)																								
					);
				list.add(board);
			}
			rs.close();
			pstmt.close();
			//list.stream().forEach( e -> System.out.println(e));
			list.stream().forEach( e -> e.setBtitle("비오는 날"));
			for(Board b: list) {
				String sql2 = """
						update boards set 
						btitle = ?
						where bwriter =?
						""";
				
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
				pstmt2.setString(1, b.getBtitle());
				pstmt2.setString(2, b.getBwriter());
				int rows = pstmt2.executeUpdate();
				System.out.println(rows);
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				}catch(SQLException e) {
					e.printStackTrace();
					}				
			}
		}

	}

}

package ch20;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExam {

	public static void main(String[] args) throws Exception {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thisisjava",  
					"java",
					"1234"     //username, password, 외부에서 접속할시 localhost부분에 특정아이피 입력가능
					);
			
			System.out.println("연결 성공");
			String sql = new StringBuilder()
					.append ("insert into boards (btitle, bcontent,bwriter, bdate, bfilename, bfiledata) ")
					.append("values (?,?,? ,now(), ?, ?)")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS); //키 반환
			pstmt.setString(1,"눈오는 날");
			pstmt.setString(2, "함박눈이 내려요");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "picture1.jpg");
			pstmt.setBlob(5,new FileInputStream("src/ch20/picture1.jpg"));
			
			int rows = pstmt.executeUpdate();
			System.out.println(rows);
			
			if(rows ==  1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
				int bno = rs.getInt(1);
				System.out.println("저장된 bno: " + bno);
			}
			rs.close();
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

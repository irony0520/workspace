package ch20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExam {

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
					.append("update boards set ")
					.append("btitle=?, ")
					.append("bcontent=?, ")
					.append("bfilename=?, ")
					.append("bfiledata=? ")
					.append("where bno=? ")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "눈사람");
			pstmt.setString(2, "눈으로 만든 사람");
			pstmt.setString(3, "picture2.jpg");
			pstmt.setBlob(4, new FileInputStream("src/ch20/picture2.jpg"));
			pstmt.setInt(5, 2);
			
			pstmt.executeUpdate();
			pstmt.close();
				
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

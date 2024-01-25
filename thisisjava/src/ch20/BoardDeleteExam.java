package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExam {

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
			
			String sql = "delete from boards where bwriter = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			int rows = pstmt.executeUpdate();
			
			
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

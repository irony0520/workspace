package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExam {

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
			String sql = "select * from users where userid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				User user = new User(
						rs.getString("userid"),
						rs.getString("username"),
						rs.getString("userpassword"),
						rs.getInt(4),
						rs.getString(5)
						);
				System.out.println(user);
				
			}else {
				System.out.println("해당 아이디를 가진 유저를 찾을 수 없습니다."); //rs.next의 값이 false = 아예 값이 없다
			}
			rs.close();
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

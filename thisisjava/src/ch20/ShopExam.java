package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ShopExam {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner scanner = new Scanner(System.in);
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sqldb",  
					"java",
					"1234"     //username, password, 외부에서 접속할시 localhost부분에 특정아이피 입력가능
					);
			
			System.out.println("연결 성공");
			System.out.println("기준 키를 입력하십시오> ");
			
			String sql = "select * from buytbl where userid in(select userid from usertbl where height >= ?)";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			int enter11 = scanner.nextInt();
			pstmt.setInt(1, enter11);
			ResultSet rs = pstmt.executeQuery();
					
			while(rs.next()) {
				int num = rs.getInt(1);
				String userID = rs.getString(2);
				String prodName = rs.getString(3);
				String groupName = rs.getString(4);
				int price = rs.getInt(5);
				int amount = rs.getInt(6);
					System.out.println(num + userID + prodName + groupName + price + amount);
						
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

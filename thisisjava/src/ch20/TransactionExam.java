package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExam {

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
			try {
				conn.setAutoCommit(false);
				String withdraw = "update accounts set balance=balance -? where ano=?";
				String deposit = "update accounts set balance = balance + ? where ano=?";
				
				PreparedStatement pstmt = conn.prepareStatement(withdraw);
				pstmt.setInt(1, 10000);
				pstmt.setString(2,"111-111-1111");
				int rows = pstmt.executeUpdate();
				if(rows == 0) {
					throw new WithdrawException("출금되지않음");				
			}
				pstmt.close();
				pstmt = conn.prepareStatement(deposit);
				pstmt.setInt(1, 10000);
				pstmt.setString(2, "222-222-2222");
				rows = pstmt.executeUpdate();
				if(rows == 0) 
					throw new DepositException("입금이 되지 않음");	//직접 설정한 exception
					pstmt.close();
					
					conn.commit();
					System.out.println("계좌 이체가 성공했습니다.");
					
			
			}catch(WithdrawException e) {
				conn.rollback();
				conn.setAutoCommit(true);
				System.out.println(e.getMessage());
			}catch(DepositException e) {
				conn.rollback();
				conn.setAutoCommit(true);
				System.out.println(e.getMessage());
				}
			finally {
				conn.setAutoCommit(true);
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

package ch20.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {

	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	
	public BoardExample() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",  
				"java",
				"1234"     //username, password, 외부에서 접속할시 localhost부분에 특정아이피 입력가능
				);
					
		}catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		}	
	public void list() {
		System.out.println("[게시물 목록]");
		System.out.println("--------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no","writer","date","title");
		System.out.println("--------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s \n",
				"1", "winter", "2022.01.27", "게시판에 오신 것을 환영합니다.");
		System.out.printf("%-6s%-12s%-16s%-40s \n",
				"2", "winter", "2022.01.27", "올 겨울은 많이 춥습니다.");
		
		try {
			String sql =  new StringBuilder()
					 .append("SELECT bno, btitle, bcontent, bwriter, bdate ") 
					 .append("FROM boards ") 
					 .append("ORDER BY bno DESC")
					 .toString();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s \n", 
						 board.getBno(),
						 board.getBwriter(),
						 board.getBdate(),
						 board.getBtitle()); //
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
			exit();
		}		
		mainMenu();
		
	}

	private void mainMenu() {
		System.out.println("--------------------------");
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.println("메뉴 선택: ");
		String enterMenu = scanner.nextLine();
		System.out.println();
	
		switch(enterMenu) {
		case "1" -> create();
		
		case "2" -> read();
		
		case "3" -> clear();
	
		case "4" -> exit();
	
		}
		
	}
	private void create() {
		Board board = new Board(); //
		System.out.println("[새 게시물 입력]");
		System.out.println("제목: ");
		board.setBtitle(scanner.nextLine());
		System.out.println("내용: ");
		board.setBcontent(scanner.nextLine());
		System.out.println("작성자: ");
		board.setBwriter(scanner.nextLine());
		
		System.out.println("-----------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuEnter = scanner.nextLine();
		
		
		if(menuEnter.equals("1")) {
			
			try {
				String sql = new StringBuilder()
						.append ("insert into boards (btitle,bwriter, bcontent,bdate) ")
						.append("values (?, ? ,?,now()) ")
						.toString();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,board.getBtitle());
				pstmt.setString(2,board.getBwriter());
				pstmt.setString(3,board.getBcontent());
				pstmt.executeUpdate();
				pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
				exit();
			}		
		}		
		list();
	}
	
	private void read() {
		
		System.out.println("[게시글 읽기]");
		System.out.println("bno: ");
		int bnoEnter = scanner.nextInt();
		scanner.nextLine();
				
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from boards where bno = ? ";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, bnoEnter);
			ResultSet rs = pstmt.executeQuery();
					
			if(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("##############");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("날짜: " + board.getBdate());
				
				System.out.println("---------------");
				System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
				System.out.println("메뉴 선택: ");
				String enterMenu2 = scanner.nextLine();
				System.out.println();
				if(enterMenu2.equals("1")) {
					update(board);
					
				}else if(enterMenu2.equals("2")) {
					delete(board);
				}
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}		
//		rs.close();
//		pstmt.close();
	}
	
	private void update(Board board) {
		
		System.out.println("[수정 내용 입력]");
		System.out.println("제목: ");
		board.setBtitle(scanner.nextLine());
		System.out.println("내용: ");
		board.setBcontent(scanner.nextLine());
		System.out.println("작성자: ");
		board.setBwriter(scanner.nextLine());
		
		System.out.println("--------------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.println("메뉴 선택: ");
		String cMenu = scanner.nextLine();
		
		if(cMenu.equals("1")) {
			
			try {
				String sql ="" +
						"UPDATE boards SET btitle= ?, bcontent= ?, bwriter= ? " +
						"WHERE bno= ?";
	//					new StringBuilder()
//						.append("update boards set ")
//						.append("btitle=?, ")
//						.append("bcontent=?, ")
//						.append("bBwriter=? ")
//						.append("where bno=? ")
//						.toString(); 외않되?
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.setInt(4, board.getBno()); //
				pstmt.executeUpdate();
				pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
				exit();
			}			
		}
		list();
	}
	
	private void delete(Board board) {
			
		try {
			String sql = "delete from boards where bno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno());
			pstmt.executeUpdate();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}		
		list();
	}
	
	
	
	
	private void clear() {
		
		System.out.println("[게시물 전체 삭제]");
		System.out.println("------------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.println("메뉴 선택: ");
		String cMenu = scanner.nextLine();
		
		if(cMenu.equals("1")) {
			try {
				String sql = "delete from boards" ;
				PreparedStatement pstmt = conn.prepareStatement(sql);
				//pstmt.setInt(1, board.getBno());
				pstmt.executeUpdate();
				pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
				exit();
			}		
		}	
		list();
	}

	
	private void exit() {
		if(conn != null) {
			try {
				conn.close();
				
			}catch(SQLException e) {
				//e.printStackTrace();				
			}
		}
		System.out.println("게시판 종료");
	}
	public static void main(String[] args) {
		BoardExample boardExample = new BoardExample();
		boardExample.list();
	}
	
	
}

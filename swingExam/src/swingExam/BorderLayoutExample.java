package swingExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BorderLayoutExample extends JFrame {

	private JTextField txtNorth;
	private JTextField txtEast;
	private JTextField txtWest;
	private JTextArea txtCenter;
	private JButton btnSouth;
	
	public BorderLayoutExample() {
		this.setTitle("보더레이아웃");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(getTxtNorth(), BorderLayout.NORTH);
		this.getContentPane().add(getTxtCenter(), BorderLayout.CENTER);
		this.getContentPane().add(getBtnSouth(), BorderLayout.SOUTH);
		this.getContentPane().add(getTxtEast(), BorderLayout.EAST);
		this.getContentPane().add(getTxtWest(), BorderLayout.WEST);
				
	}
	
	private Component getTxtWest() {
		if(txtWest == null) {
			txtWest = new JTextField();
			txtWest.setText("새로만든 서쪽 컴포넌트");
			//txtWest.setSize(25, 25);
			txtWest.setBackground(Color.PINK);
			
		}
		return txtWest;
		
		
	}

	private Component getTxtEast() {
		if(txtEast == null) {
			txtEast = new JTextField();
			txtEast.setText("새로만든 동쪽 컴포넌트");
			//txtEast.setSize(5, 5);
			txtEast.setBackground(Color.CYAN);
		}
		return txtEast;
				
		
		
	}

	private JTextField getTxtNorth() {
		if(txtNorth == null) {
			txtNorth = new JTextField();
			txtNorth.setText("북쪽 컴포넌트");    
			txtNorth.setBackground(Color.YELLOW);
			
		}
		return txtNorth;
	}
	
	private JTextArea getTxtCenter() {
		 if(txtCenter ==null) {
			 txtCenter = new JTextArea();
			 txtCenter.append("중앙 컴포넌트\n");
			 txtCenter.append("동쪽 컴포넌트만듬\n");   //textarea는 append로 텍스트 추가 
			 txtCenter.append("서쪽 컴포넌트만듬\n");
		 }
		 return txtCenter;
		
	}
	
	private JButton getBtnSouth()  {
		if(btnSouth == null) {
			btnSouth = new JButton();
			btnSouth.setText("남쪽 컴포넌트");
		}
		return btnSouth;
	}
	
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BorderLayoutExample ble = new BorderLayoutExample();
				ble.setVisible(true);
			}
			
		});

	}

}

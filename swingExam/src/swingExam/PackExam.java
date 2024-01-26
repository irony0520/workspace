package swingExam;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PackExam extends JFrame{
	
	private JButton btnOk,btnCancle;
	
	public PackExam() {
		this.setTitle("팩 연습문제");
		//this.setSize(300,200); 사이즈는 자동으로 지정 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnOk());
		this.getContentPane().add(getBtnCancle());
		
		this.pack(); // 
	}
	
	

	private JButton getBtnCancle() {
		if(btnCancle==null) {
			btnCancle = new JButton();
			btnCancle.setText("취소");
		}
		return btnCancle;
	}



	private JButton getBtnOk() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("확인");
		}
		return btnOk;
		
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PackExam pe = new PackExam();
				pe.setVisible(true);
		

			}

		});
	}
}

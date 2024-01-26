package swingExam;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FlowLayoutExam extends JFrame{

	private JButton btnOk;
	private JButton btnCancle;   //html느낌
	
	public FlowLayoutExam() {
		this.setTitle("플로우 레이아웃");
		this.setSize(50,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
		
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnOk());
		this.getContentPane().add(getBtnCancle());
	}
	
	
	private Component getBtnOk() {
			if(btnCancle == null) {
				btnCancle = new JButton();
				btnCancle.setText("확인");
			}
			return btnCancle;
		}
	private Component getBtnCancle() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("취소");
		}
		return btnOk;
	}

	


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FlowLayoutExam fle = new FlowLayoutExam();
				fle.setVisible(true);
			}
		
			
		});

	}

}

package swingExam;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NullLayoutExam extends JFrame{
	
	private JButton btnOk;
	
	public NullLayoutExam() {
		this.setTitle("널 레이아웃");
		setSize(300,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(getBtnOk());
	}
	
	

	private JButton getBtnOk() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("확인");
			btnOk.setBounds(105,50,90,100);
		}
		
		return btnOk;
	}




	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NullLayoutExam nle = new NullLayoutExam();
				nle.setVisible(true);

			}
		});
	}
}



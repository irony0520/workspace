package swingExam.eventListner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CloseExam extends JFrame{
	
	private JButton btnClose;
	
	public CloseExam() {
		this.setTitle("닫기 버튼 만들기");
		this.setSize(300,100);
		
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnClose());
		
		this.addWindowListener(new MyWindowAdapter());
	}

	private JButton getBtnClose() {
		if(btnClose == null) {
			btnClose = new JButton();
			btnClose.setText("닫기");
			
			btnClose.addActionListener(new MyActionListener());
		}
		return btnClose;
		
	}

	class MyActionListener implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		} //?
	}
	
	class MyWindowAdapter extends WindowAdapter {
		@Override 
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CloseExam ce = new CloseExam();
				ce.setVisible(true);
			}
			
		});
	}

}

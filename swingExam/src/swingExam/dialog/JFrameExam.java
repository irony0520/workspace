package swingExam.dialog;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JFrameExam extends JFrame {
	private JButton btnOpenDialog;

	
	public JFrameExam() {
	setTitle("JFrame");
	setSize(500,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().add(getBtnOpenDialog(),BorderLayout.SOUTH);
}
	
	private JButton getBtnOpenDialog() {
	if(btnOpenDialog == null) {
		btnOpenDialog = new JButton();
		btnOpenDialog.setText("다이얼로그 띄우기");
		btnOpenDialog.addActionListener(new java.awt.event.ActionListener() {
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				JDialogExam jDialog = new JDialogExam(JFrameExam.this);
				jDialog.setVisible(true);
			}
		});
	}
	return btnOpenDialog;
}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameExam jfe = new JFrameExam();
						jfe.setVisible(true);
			}
		});

	}

}

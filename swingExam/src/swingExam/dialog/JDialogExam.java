package swingExam.dialog;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JDialogExam extends JDialog{

	private JButton btnClose;
	
public JDialogExam(JFrame owner) {
	super(owner);
	setTitle("JDialog 만들기");
	setSize(300,200);
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	setResizable(false);
	setModal(true);
	setLocation(
			owner.getLocationOnScreen().x + (owner.getWidth()-this.getWidth())/2 
			,owner.getLocationOnScreen().y + (owner.getHeight()-this.getHeight())/2);
	this.getContentPane().add(getBtnClose(),BorderLayout.SOUTH);
	
}
	
	
	
	private JButton getBtnClose() {
	if(btnClose == null) {
		btnClose = new JButton();
		btnClose.setText("닫기");
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialogExam.this.dispose();
				
			}
		});
	}
	return btnClose;
 }

	
}

package swingExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JPanelExam extends JFrame{

	private JPanel panelSouth;
	private JButton btnOk;
	private JButton btnCancle;
	
	public JPanelExam() {
		this.setTitle("제이패널");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getPanelSouth(),BorderLayout.SOUTH);
		
	}
	
	
	private JPanel getPanelSouth() {
		if(panelSouth == null) {
			
			panelSouth = new JPanel();
			panelSouth.setBackground(Color.magenta);
			panelSouth.add(getBtnOk());
			panelSouth.add(getBtnCancle());
		}
		return panelSouth;
	}
	
	
	private Component getBtnCancle() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("취소");
		}
		return btnOk;
	}
	
	
	private Component getBtnOk() {
		if(btnCancle == null) {
			btnCancle = new JButton();
			btnCancle.setText("확인");
		}
		return btnCancle;
	}
		
		


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JPanelExam jpe = new JPanelExam();
				jpe.setVisible(true);
			}
		});

	}

}

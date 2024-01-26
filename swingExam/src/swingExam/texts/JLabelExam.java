package swingExam.texts;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

public class JLabelExam extends JFrame{
	
	private JLabel jLabel1,jLabel2,jLabel3,jLabel4;
	
	public JLabelExam() {
		setTitle("라벨 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(4,1));
		
		this.getContentPane().add(getJLabel1());
		this.getContentPane().add(getJLabel2());
		this.getContentPane().add(getJLabel3());
		this.getContentPane().add(getJLabel4());
		this.setSize(1000, 1000);
		
	}
	

	private JLabel getJLabel4() {
		if(jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("라벨4");
			jLabel4.setIcon(new ImageIcon(getClass().getResource("smile.jpg")));
			jLabel4.setHorizontalAlignment(JLabel.CENTER);
			jLabel4.setIconTextGap(200);
			jLabel4.setBorder(new EtchedBorder());			
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if(jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("라벨3");
			jLabel3.setIcon(new ImageIcon(getClass().getResource("smile.jpg")));
			jLabel3.setHorizontalAlignment(JLabel.CENTER);
			jLabel3.setHorizontalTextPosition(JLabel.LEFT);
			jLabel3.setBorder(new EtchedBorder());			
		}
		return jLabel3;
	}


	private JLabel  getJLabel2() {
		if(jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("라벨2");
			jLabel2.setIcon(new ImageIcon(getClass().getResource("smile.jpg")));
			jLabel2.setHorizontalAlignment(JLabel.CENTER);
			jLabel2.setBorder(new EtchedBorder());			
		}
		return jLabel2;
	}


	private JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("라벨1");
			jLabel1.setHorizontalAlignment(JLabel.LEFT);
			jLabel1.setBorder(new EtchedBorder());			
		}
		return jLabel1;
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JLabelExam jlabele = new JLabelExam();
				jlabele.setVisible(true);
			}
			
			
		});

	}

}

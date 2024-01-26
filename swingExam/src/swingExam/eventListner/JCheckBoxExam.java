package swingExam.eventListner;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JCheckBoxExam extends JFrame{
	
	private JPanel pWest;
	private JCheckBox cbMale;
	private JCheckBox cbFemale;
	private JCheckBox cbWhite;
	private JCheckBox cbBlack;
	private JLabel lblPicture;
	
	
	public JCheckBoxExam () {
		setTitle("체크박스 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getPWest(),BorderLayout.WEST);
		this.getContentPane().add(getLblPicture(),BorderLayout.CENTER);
		this.pack();
		
	}
	
	public JLabel getLblPicture() {
		if(lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("man.jpg")));
		}
		return lblPicture;
	}

	
	

	public JPanel getPWest() {
		if(pWest == null) {
			pWest = new JPanel(new GridLayout(2,1));
			
			pWest.add(getCbMale());
			pWest.add(getCFemale());
			pWest.add(getCbWhite());
			pWest.add(getCbBlack());	
		}
		return pWest;
	}
	

	public JCheckBox getCbBlack() {
		if(cbBlack == null) {
			cbBlack = new JCheckBox();
			cbBlack.setText("흑인");
			//cbBlack.addActionListener(actionListener);
		}
		return cbBlack;
	}

	public JCheckBox getCbWhite() {
		if(cbWhite == null) {
			cbWhite = new JCheckBox();
			cbWhite.setText("백인");
			//cbWhite.addActionListener(actionListener);
		}
		return cbWhite;
	}

	public JCheckBox getCFemale() {
		if(cbFemale == null) {
			cbFemale = new JCheckBox();
			cbFemale.setText("여성");
			//cbFemale.addActionListener(actionListener);
		}
		return cbFemale;
	}

	public JCheckBox getCbMale() {
		if(cbMale == null) {
			cbMale = new JCheckBox();
			cbMale.setText("남성");
			//cbMale.addActionListener(actionListener);
		}
		return cbMale;
	}

//	public ActionListener actionListener = new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			if()
//		}
//	}
//	




	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JCheckBoxExam cbe = new JCheckBoxExam();
				cbe.setVisible(true);
			}
			
			
		});

	}

}

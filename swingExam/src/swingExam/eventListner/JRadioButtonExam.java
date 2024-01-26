package swingExam.eventListner;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class JRadioButtonExam extends JFrame{
	
	private JPanel radioPanel;
	private JLabel lb1Picture;
	private JRadioButton rbBird;
	private JRadioButton rbCat;
	
	
	public JRadioButtonExam() {
		setTitle("라디오 버튼 생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getRadioPanel(),BorderLayout.SOUTH);
		this.getContentPane().add(getLb1Picture(),BorderLayout.NORTH);
		pack();
	}

	
	
	public JPanel getRadioPanel() {
		if(radioPanel == null ) {
			radioPanel = new JPanel();
			radioPanel.setLayout(new GridLayout(1,2));
			radioPanel.add(getRbBird());
			radioPanel.add(getRbCat());
			
			//buttonGroup
			ButtonGroup bg = new ButtonGroup();
			bg.add(getRbBird());
			bg.add(getRbCat());
		}
		return radioPanel;
	}



	public JRadioButton getRbBird() {
		if(rbBird == null) {
			rbBird = new JRadioButton();
			rbBird.setText("앵무새");
			rbBird.setSelected(true); //기본으로 클릭된 상태
			rbBird.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLb1Picture().setIcon(new ImageIcon(getClass().getResource("bird.jpg")));
				}
			});
		}
		return rbBird;
	}



	public JRadioButton getRbCat() {
		if(rbCat == null) {
			rbCat = new JRadioButton();
			rbCat.setText("고양이");
			rbCat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLb1Picture().setIcon(new ImageIcon(getClass().getResource("cat3.jpg")));
				}
			});
			
		}
		return rbCat;
	}



	private JLabel getLb1Picture() {
		if(lb1Picture == null) {
			lb1Picture = new JLabel();
			lb1Picture.setIcon(new ImageIcon(getClass().getResource("bird.jpg")));
		}
	
		return lb1Picture;
	}



	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JRadioButtonExam jrbe = new JRadioButtonExam();
				jrbe.setVisible(true);
			}
			
			
		});

	}

}

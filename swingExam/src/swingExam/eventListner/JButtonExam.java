package swingExam.eventListner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JButtonExam extends JFrame {
	
	private JButton btn1,btn2,btn3;
	
	public JButtonExam() {
		 this.setTitle("JButtonExample");
		 this.setSize(300, 100);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.getContentPane().setLayout(new FlowLayout());
		 this.getContentPane().add(getBtn1());
//		 this.getContentPane().add(getBtn2());
//		 this.getContentPane().add(getBtn3());
	}
	

	private JButton getBtn1() {
		if(btn1 == null) {
			btn1 = new JButton();
			btn1.setText("새문서");
			
			//
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser jfc = new JFileChooser();
					jfc.showOpenDialog(JButtonExam.this);
				}
			});
		}
		return btn1;
	}

	private JButton getBtn2() {
		if(btn2 == null) {
			btn2 = new JButton();
			btn2.setIcon(new ImageIcon(getClass().getResource("swingExam/eventListner/cat2.gif")));
			
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser jfc = new JFileChooser();
					jfc.showOpenDialog(JButtonExam.this);
				}
			});
		}
		return btn2;
	}

	private JButton getBtn3() {
		if(btn3 == null) {
			btn3 = new JButton();
			btn3.setText("새문서");
//			btn3.setIcon(new ImageIcon(getClass().getResource("cat2.gif")));
			
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser jfc = new JFileChooser();
					jfc.showOpenDialog(JButtonExam.this);
				}
			});
		}
		return btn3;
	}






	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JButtonExam je = new JButtonExam();
				je.setVisible(true);
			}
			
		});
		

	}

}

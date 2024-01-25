package swingExam;

import java.awt.GraphicsEnvironment;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JFrameExam extends JFrame{

	public JFrameExam() {
		this.setSize(600, 500);	
		this.setIconImage(new ImageIcon(getClass().getResource("picture1.jpg")).getImage());
		this.setTitle("사진1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				JFrameExam jframe = new JFrameExam();
				jframe.setVisible(true);
			}		
		});

	}

}

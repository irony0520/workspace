package swingExam;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class JsScrollpane extends JFrame{
	
	private JScrollPane scrollImage;
	private JLabel lb1Image;
	
	public JsScrollpane() {
		this.setTitle("JScrollPaneExample");
		this.setSize(350,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getScrollImage(),BorderLayout.CENTER); //getScrollImage 메소드 생성
	}

	private JScrollPane getScrollImage() {
		if(scrollImage == null) {
			scrollImage = new JScrollPane(getLb1Image());  //getLb1Image 메소드 
		}
		return scrollImage;
		
	}

	private JLabel getLb1Image() {
		if(lb1Image == null) {
			lb1Image = new JLabel();
			lb1Image.setIcon(new ImageIcon(getClass().getResource("scroll1.jpg")));
		}
		return lb1Image;
		
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JsScrollpane jframe = new JsScrollpane();
				jframe.setVisible(true);
			}
		});

	}

}

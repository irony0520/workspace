package swingExam;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GridLayoutExam extends JFrame{
	
	private JButton[][] btn;  //배열
	
	public GridLayoutExam() {
		this.setTitle("그리드");
		this.setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2,3));
		for(int i = 0;i<2;i++) {
			for(int j=0;j<3;j++) {
				this.getContentPane().add(getBtn()[i][j]); //wtf?
			}
		}
			
	}

	private JButton[][] getBtn() {
		
		if(btn == null) {
			btn = new JButton[2][3];
			for(int i = 0;i<2;i++) {
				for(int j=0;j<3;j++) {
					btn[i][j] = new JButton();  //
					btn[i][j].setText("["+i+"]"+"["+j+"]");
				}
		}
		
	}
		return btn;
	}



	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GridLayoutExam gle = new GridLayoutExam();
				gle.setVisible(true);
			}
		});

	}

}

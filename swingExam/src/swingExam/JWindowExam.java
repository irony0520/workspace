package swingExam;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class JWindowExam extends JWindow{

			
		public JWindowExam() {
			this.setSize(600,350);			
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			Point centerPoint = ge.getCenterPoint();
			int leftTopX = centerPoint.x - this.getWidth()/2;
			int leftTopY = centerPoint.y - this.getHeight()/2;
			this.setLocation(leftTopX, leftTopY);
		
		
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
					
		});		
	}
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					JWindowExam jWindow = new JWindowExam();
					jWindow.setVisible(true);
				}
				
			});
		}
}


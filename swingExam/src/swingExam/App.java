package swingExam;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App extends JFrame {
	
	public App() {
		
		setTitle("처음 만든 윈도우");
		setSize(300,100);
		add(new JButton("OK"), BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
	}
	

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			
			App app = new App();
			app.setVisible(true);
		});
		


	}

}

package swingExam;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class JTabbedPaneExam extends JFrame{

	private JTabbedPane jTabbedPane;
	private JPanel tab1Panell;
	private JPanel tab1Panel2;
	
	public JTabbedPaneExam() {
		this.setTitle("탭 예제");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getJTabbedPane(),BorderLayout.CENTER);
	}//getter느낌 없는걸 메소드로 만들어주는게 유지보수에 유리
	
	private JTabbedPane getJTabbedPane() {
		if(jTabbedPane ==null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setTabPlacement(JTabbedPane.LEFT); //tab1 , 2의 위치 
			jTabbedPane.addTab("탭1",getTab1Panel());
			jTabbedPane.addTab("탭2",getTab1Pane2());
		}
		return this.jTabbedPane;
	}
	
	
	private JPanel getTab1Panel() {
		if(tab1Panell ==null) {
			tab1Panell = new JPanel();
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("picture1.jpg")));
			tab1Panell.add(jLabel);			
		}
		return tab1Panell;
	}
	
	private JPanel getTab1Pane2() {
		if(tab1Panel2 ==null) {
			tab1Panel2 = new JPanel();
			
		}
		return tab1Panel2;
			
	}
		

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JTabbedPaneExam jt = new JTabbedPaneExam(); 
			jt.setVisible(true);
		});

	}

}

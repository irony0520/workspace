package swingExam.texts;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class JEditorPaneExam extends JFrame{
	
	private JEditorPane jEditorPane;

	public JEditorPaneExam() {
		setTitle("J에디터 파일 만들기/153page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJEditorPane()),BorderLayout.CENTER); //scrollpane안에 
		setSize(800,800);
	}
	
	
	private JEditorPane getJEditorPane() {
		if(jEditorPane == null) {
			jEditorPane = new JEditorPane();
			try {
				jEditorPane.setPage(getClass().getResource("html2.html"));
			} catch (Exception e) {}  //파일명 틀리거나 오류있으면 아무것도 안뜸
			jEditorPane.setEditable(false);
			jEditorPane.addHyperlinkListener(new HyperlinkListener() {
				public void hyperlinkUpdate(HyperlinkEvent e) {
					
				if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) { //링크 클릭시 링크된 문서들을 보여준다. 
					try {
						jEditorPane.setPage(e.getURL());
					} catch (Exception e1) {}
				}
				}
			});
			
		}
		return jEditorPane;
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JEditorPaneExam epe = new JEditorPaneExam();
				epe.setVisible(true);
			}
			
			
		});

	}

}

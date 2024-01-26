package swingExam.texts;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JTextAreaExam extends JFrame{
	
	private JTextArea txtDisplay;
	private JPanel pSouth;
	private JTextField txtInput;
	private JButton btnSend;
	
	public JTextAreaExam() {
		setTitle("텍스트 에리아 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getTxtDisplay()),BorderLayout.CENTER);  //스크롤에 넣어서 텍스트에리아 생성
		this.getContentPane().add(getPSouth(),BorderLayout.SOUTH);
		this.setSize(300,200);
	}
	
	

	private JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			pSouth.setLayout(new BorderLayout());
			pSouth.add(getTxtInput(),BorderLayout.CENTER);
			pSouth.add(getBtnSend(),BorderLayout.EAST);
			
		}
		return pSouth;
	}



	private JButton getBtnSend() {
		if(btnSend == null) {
			btnSend = new JButton();
			btnSend.setText("전송");
			btnSend.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				getTxtDisplay().append(getTxtInput().getText() + "\n"); //여기서 텍스트 입력 구현
				getTxtInput().setText("");
				}
			});
		}
		return btnSend;
	}



	private JTextField getTxtInput() {
		if(txtInput == null) {
			txtInput = new JTextField();
			
		}
		return txtInput;
	}



	private JTextArea getTxtDisplay() {
		if(txtDisplay == null) {
			txtDisplay = new JTextArea();
			txtDisplay.setEditable(false);
		}
		return txtDisplay;
	}



	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTextAreaExam tae = new JTextAreaExam();
				tae.setVisible(true);
			}
			
			
		});

}
}

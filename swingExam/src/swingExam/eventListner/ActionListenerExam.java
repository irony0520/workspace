package swingExam.eventListner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ActionListenerExam extends JFrame{
	
	private JButton btnOk,btnCancel;
	
	public ActionListenerExam() {
		setTitle("액션리스너 연습");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnOk());
		this.getContentPane().add(getBtnCancel());
		}
	
	
	private JButton getBtnCancel() {
		if(btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("취소");
			btnCancel.addActionListener(actionListener);
		}
		return btnCancel;
	}


	private JButton getBtnOk() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("확인");
			btnOk.addActionListener(actionListener);
			
		}
		return btnOk;
	}


	private ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			//컴포넌트 구분
			if(e.getSource()==btnOk) {
				System.out.println("확인 버튼을 클릭했습니다.");
			}else if(e.getSource() == btnCancel) {
				System.out.println("취소 버튼을 클릭했습니다.");
			}
		}
	};
	


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ActionListenerExam ale = new ActionListenerExam();
				ale.setVisible(true);
			}
			
		});
		

	}

}

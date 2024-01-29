package swingExam.dialog;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class JOptionPaneExam extends JFrame{
	
	private JButton btnMessage,btnConfirm;
	private JButton btnInput, btnOption;
	
	public JOptionPaneExam() {
		setTitle("제이옵션");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(4,1));
		getContentPane().add(getBtnMessage());
		getContentPane().add(getBtnConfirm());
		getContentPane().add(getBtnInput());
		getContentPane().add(getBtnOption());
		setSize(500,300);
		
	}
	

	private JButton getBtnMessage() {
		if(btnMessage == null) {
			btnMessage = new JButton();
			btnMessage.setText("MessageDialog");
			btnMessage.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(JOptionPaneExam.this, "다이얼로그 텍스트 내용","INFORMATION_MESSAGE"
							,JOptionPane.INFORMATION_MESSAGE);
					
				}
			});
		}
		return btnMessage;
	}


	private JButton getBtnConfirm() {
		if(btnConfirm == null) {
			btnConfirm = new JButton();
			btnConfirm.setText("ConfirmDialog");
			btnConfirm.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int option = JOptionPane.showConfirmDialog(JOptionPaneExam.this, "다이얼로그 텍스트 내용","OK_CANCEL_OPTION",
							JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null);
					
					if(option == JOptionPane.OK_OPTION) {
						System.out.println("확인 버튼을 눌렀습니다.");
					}else if(option == JOptionPane.CANCEL_OPTION) {
						System.out.println("취소 버튼을 눌렀습니다.");
					}else if(option == JOptionPane.CLOSED_OPTION) {
						System.out.println("닫기 버튼을 눌렀습니다.");
					}				
				}
			});
		}
		return btnConfirm;
	 }

	private JButton getBtnInput() {
		if(btnInput == null) {
			btnInput = new JButton();
			btnInput.setText("inputDialog");
			btnInput.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String input = null;
					
					input = JOptionPane.showInputDialog(JOptionPaneExam.this, "다이얼로그 텍스트 내용","InputDialog",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("입력된 텍스트: " + input);
					
					input = (String) JOptionPane.showInputDialog(JOptionPaneExam.this,"다이얼로그 텍스트 내용","InputDialog",
							JOptionPane.PLAIN_MESSAGE,null,new String[] {"Java", "JDBC", "JSP", "Spring"},"JDBC");
					System.out.println("선택된 항목: " + input);
				}
			});
		}
		return btnInput;
	}
	
	private JButton getBtnOption() {
		if(btnOption == null) {
			btnOption = new JButton();
			btnOption.setText("inputDialog");
			btnOption.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int option = JOptionPane.showOptionDialog(JOptionPaneExam.this, "다이얼로그의 텍스트 내용","OptionDialog",
						JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,new String[] {"시작","종료"},"시작");
					
					if(option == 0) {
						System.out.println("시작 버튼을 눌렀습니다");
					}else if(option == 1) {
						System.out.println("종료 버튼을 눌렀습니다.");
					}
				}
			});
		}
		return btnOption;
	}


	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JOptionPaneExam jope = new JOptionPaneExam();
				jope.setVisible(true);
			}
		});

	}

}

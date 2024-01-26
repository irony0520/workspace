package swingExam.texts;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JTextFieldExam extends JFrame{
	
	private JTextField txtId;
	private JPasswordField txtPassword;
	
	public JTextFieldExam() {
		setTitle("아이디와 비밀번호 텍스트 필드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2,2));
		this.getContentPane().add(new JLabel("아이디",JLabel.CENTER));
		this.getContentPane().add(getTxtId());
		this.getContentPane().add(new JLabel("비밀번호",JLabel.CENTER));
		this.getContentPane().add(getTxtPassword());
		this.setSize(300,200);
	}
	
	private JTextField getTxtId() {
		if(txtId == null) {
			txtId = new JTextField();
			txtId.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() >= KeyEvent.VK_A && e.getKeyCode() <= KeyEvent.VK_Z) {
						//입력된 키 코드가 알파벳인지 확인
						JOptionPane.showMessageDialog(JTextFieldExam.this, "알파벳 입니다.");
					}else {
						JOptionPane.showMessageDialog(JTextFieldExam.this, "알파벳이 아닙니다.");
					}
					
				}
				
			});
			
		}
		return txtId;
		
	}

	private JPasswordField getTxtPassword() {
		if(txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String password = new String(txtPassword.getPassword());  //char배열로 리턴한get password를 스트링으로 변환
					JOptionPane.showMessageDialog(JTextFieldExam.this,"입력한 패스워드: " +  password);
				}
			});
		}
		return txtPassword;
	}

	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTextFieldExam tfe = new JTextFieldExam();
				tfe.setVisible(true);
			}
			
			
		});
	}

}

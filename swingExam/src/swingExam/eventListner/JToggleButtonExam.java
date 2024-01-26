package swingExam.eventListner;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

public class JToggleButtonExam extends JFrame{
	
	private JPanel pFirst;
	private JPanel pSecond;
	private JToggleButton tbOnOff;
	private JToggleButton tbStart;
	private JToggleButton tbStop;
	
	
	public JToggleButtonExam() {
		setTitle("제이토글 버튼 생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2,1));   //아래 위 1칸씩 2칸하고 생성하고 위 칸에 on.off 밑칸에 start stop
		this.getContentPane().add(getPFirst());
		this.getContentPane().add(getPSecond());
		this.pack();
	}
	
	
	private JPanel getPFirst() {
		if(pFirst == null) {
			pFirst = new JPanel();
			pFirst.add(getTbOnOff());
		}
		return pFirst;
	}

	

	private JToggleButton getTbOnOff() {
		
		if(tbOnOff == null) {
			tbOnOff = new JToggleButton();
			tbOnOff.setText("On");
			tbOnOff.addItemListener(new ItemListener() {
				@Override 
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						getTbOnOff().setText("Off");						
					}else {
						getTbOnOff().setText("On");
					}
				}
			});
		}
		return tbOnOff;
	}


	private JPanel getPSecond() {
		if(pSecond == null) {
			pSecond = new JPanel();
			pSecond.setBorder(new TitledBorder("원하는 기능은?"));
			pSecond.add(getTbStart());
			pSecond.add(getTbStop());
			
			ButtonGroup buttonGroup = new ButtonGroup();
			buttonGroup.add(getTbStart());
			buttonGroup.add(getTbStop());
		}
		return pSecond;
	}

	private JToggleButton getTbStart() {
		if(tbStart == null) {
			tbStart = new JToggleButton();
			tbStart.setText("Start");
			tbStart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(JToggleButtonExam.this,"start" );
				}
			});
		}
		return tbStart;
	}

	
	private JToggleButton getTbStop() {
		if(tbStop == null) {
			tbStop = new JToggleButton();
			tbStop.setText("Stop");
			tbStop.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(JToggleButtonExam.this,"Stop" );
				}
			});
		}
		return tbStop;
	}


	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JToggleButtonExam jbe = new JToggleButtonExam();
				jbe.setVisible(true);
			}
			
			
		});
		

	}//on,off 버튼과 buttongroup 으로 묶은 start stop 버튼 

}

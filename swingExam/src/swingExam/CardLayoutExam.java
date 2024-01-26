package swingExam;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CardLayoutExam extends JFrame{
	
	private JPanel redCard,blueCard,greenCard;
	
	public CardLayoutExam() {
		setTitle("카드레이어");
		setSize(250,400);
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add("redCard",getRedCard());
		this.getContentPane().add("blueCard",getBlueCard());
		this.getContentPane().add("greenCard",getGreenCard());
	}
	

	private JPanel getGreenCard() {
		if(greenCard == null) {
			greenCard = new JPanel();
			greenCard.setBackground(Color.GREEN);
		}
		return greenCard;
	}


	private JPanel getBlueCard() {
		if(blueCard == null) {
			blueCard = new JPanel();
			blueCard.setBackground(Color.BLUE);
		}
		return blueCard;
	}


	private JPanel getRedCard() {
		if(redCard == null) {
			redCard = new JPanel();
			redCard.setBackground(Color.RED);
		}
		return redCard;
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CardLayoutExam cle = new CardLayoutExam();
				cle.setVisible(true);
				
				Thread thread = new Thread() {
					public void run() {
						for(int i=0;i<10;i++) {
							try {
								Thread.sleep(1000);  //10초간 지속 1초마다 변경 
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							SwingUtilities.invokeLater(new Runnable() {
								@Override
								public void run() {
									CardLayout cardLayout = 
											(CardLayout)cle.getContentPane().getLayout();
									cardLayout.next(cle.getContentPane());
								}
							});
						}
					}
				};
				thread.start();
			}
		
	});

}
}

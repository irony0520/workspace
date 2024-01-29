package swingExam.list;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListExam extends JFrame{

	private JPanel pWest;
	private JList listString;
	private JList listImage;
	private JLabel jlabel;
	
	
	public JListExam() {
		setTitle("제이리스트 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().add(getPWest(),BorderLayout.WEST);
		getContentPane().add(getJLabel(),BorderLayout.CENTER);
		
		
	}
	
	
	
	private JLabel getJLabel() {
		if(jlabel == null) {
			jlabel = new JLabel();
			jlabel.setHorizontalAlignment(JLabel.CENTER);
			
		}
		return jlabel;
	}



	private JPanel getPWest() {
		if(pWest == null) {
			pWest = new JPanel();
			pWest.setLayout(new GridLayout(2,1));
			pWest.add(new JScrollPane(getListSTring()));
			pWest.add(new JScrollPane(getListImage()));
		}
		return pWest;
		
	}



	private JList getListImage() {
		if(listImage == null) {
			Vector items = new Vector();
			for(int i =1;i<10;i++) {
				ImageIcon image = new ImageIcon(
						getClass().getResource("fruit" +i +".jpg"));
				items.addElement(image);
			}
			listImage = new JList(items);
			listImage.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					if(!e.getValueIsAdjusting()) {
						ImageIcon image = (ImageIcon) listImage.getSelectedValue();
						getJLabel().setIcon(image);
					}
				}
			});
		}
		return listImage;
	}



	private JList getListSTring() {
		if(listString == null) {
			String[]items = {
					"Cantaloupe", "Grapefruit", "Grapes", "Kiwi", "Peach",
					 "pineapple", "strawberry", "tomato", "watermelon"	
			};
			listString = new JList(items);
			listString.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					if(!e.getValueIsAdjusting()) {
						int selectedIndex = listString.getSelectedIndex();
						ImageIcon image = new ImageIcon(
								getClass().getResource("fruit"+(selectedIndex +1) + ".jpg"));
						getJLabel().setIcon(image);				
					}
				}
			});
		}
		return listImage;
	}



	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JListExam jle = new JListExam();
				jle.setVisible(true);
			}
		});

	}

}

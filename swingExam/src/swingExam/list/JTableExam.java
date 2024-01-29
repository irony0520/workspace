package swingExam.list;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class JTableExam extends JFrame{
	
	private JTable jTable;
	
	public JTableExam() {
		setTitle("제이테이블 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new JScrollPane(getJtable()),BorderLayout.CENTER);
		setSize(200,125);
	}

	private JTable getJtable() {
		if(jTable == null) {
			String[] columnNames = {"이름","나이" };
			Object[][] rowData = { 
					{ "춘삼월", 25 },
					{ "하여름", 23 },
					{ "하바다", 26 },
					{ "추가을", 22 },
					{ "동겨울", 27 },
					{ "동장군", 15 }
			};
			jTable = new JTable(rowData,columnNames);
			
			jTable.getColumn("나이").setPreferredWidth(50);
			jTable.getColumn("이름").setPreferredWidth(100);
		}
		return jTable;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			JTableExam jFrame = new JTableExam();
			jFrame.setVisible(true);

			}
		});
	}

}

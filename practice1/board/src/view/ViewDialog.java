package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import model.BoardDAO;
import model.BoardDTO;

public class ViewDialog extends JDialog {
	private BoardApp boardApp;
	private JPanel pCenter, pTitle, pContent, pWriter, pSouth;
	private JTextField txtTitle, txtWriter;
	private JTextArea txtContent;
	private JButton btnUpdate, btnDelete, btnClose;
	private int bno;
	//
	private JTable jTable;
	//
	
	public ViewDialog(BoardApp boardApp, int bno) {
		this.boardApp = boardApp;
		this.bno = bno;
		this.setTitle("게시물 보기");					
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setResizable(false);	
		this.setModal(true);
		this.setSize(400, 270);
		
		this.setLocation(
			boardApp.getLocationOnScreen().x + (boardApp.getWidth()-this.getWidth())/2,
			boardApp.getLocationOnScreen().y + (boardApp.getHeight()-this.getHeight())/2
		);
		
		this.getContentPane().add(getPCenter(), BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
		this.setBoard();
		//
		this.getContentPane().add(getJTable()).BorderLayout.CENTER);
		//
	}
	
	public JPanel getPCenter() {
		if(pCenter==null) {
			/*코드 추가*/
		}
		return pCenter;
	}
	
	public JPanel getPTitle() {
		if(pTitle==null) {
			/*코드 추가*/
		}
		return pTitle;
	}	
	
	public JPanel getPWriter() {
		if(pWriter==null) {
			/*코드 추가*/
		}
		return pWriter;
	}		
	
	public JPanel getPContent() {
		if(pContent == null) {
			/*코드 추가*/
		}
		return pContent;
	}

	public JPanel getPSouth() {
		if(pSouth == null) {
			//
			pSouth = new JPanel();
			JPanel pButton = new JPanel();
			pButton.add(getBtnUpdate());
			pButton.add(getBtnDelete());
			pButton.add(getBtnClose());		
			pSouth.add(pButton);
		}
		return pSouth;
	}
	
	public void setBoard() {
		/*코드 추가*/
	}
	
	public JButton getBtnUpdate() {
		if(btnUpdate == null) {
			//
			btnUpdate = new JButton();
			btnUpdate.setText("수정");
			btnUpdate.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel tableModel = (DefaultTableModel)getJTable().getModel();
					Vector<Vector> rows = tableModel.getDataVector();
					Vector<E> row = rows.elementAt(jTable.getSelectedRow());
					row.set(0, txtTitle.getText());
					row.set(1, txtWriter.getText());
					row.set(2, txtContent.getText());
					tableModel.fireTableDataChanged();
					txtTitle.setText("");
					txtWriter.setText("");
					txtContent.setText("");
				}
			});
			
		}
		return btnUpdate;
		//
	}
	
	public JButton getBtnDelete() {
		if(btnDelete == null) {
			/*코드 추가*/
			btnDelete = new JButton();
			btnDelete.setText("삭제");
			btnDelete.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int rowIndex = getJTable().getSelectedRow();
					if(rowIndex != -1) {
						DefaultTableModel tableModel= (DefaultTableModel) getJTable().getModel();
						tableModel.removeRow(rowIndex);
						txtTitle.setText("");
						txtWriter.setText("");
						txtContent.setText("");
					}		
				}
			});
		}
		return btnDelete;
		//
	}	
	
	public JButton getBtnClose() {
		if(btnClose == null) {
			/*코드 추가*/
			btnClose = new JButton();
			btnClose.setText("닫기");
		}
		return btnClose;
	}	
	//p180
	public JTable getJTable() {
		jTable = new JTable();
		final DefaultTableModel tableModel = (DefaultTableModel)jTable.getModel();
		tableModel.addColumn("제목");
		tableModel.addColumn("글쓴이");
		tableModel.addColumn("내용");
		
		jTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int rowIndex = jTable.getSelectedRow();
				if(rowIndex != -1) {
					String title = (String) tableModel.getValueAt(rowIndex, 0);
					String writer = (String) tableModel.getValueAt(rowIndex, 0);
					String content = (String) tableModel.getValueAt(rowIndex, 0);
					txtTitle.setText(title); 
					txtWriter.setText(writer));
					txtContent.setText(content);
				}
			}
		});
		
	}
	return jTable;
		
}
//





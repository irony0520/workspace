package swingExam.Tree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;

public class JTreeExam extends JFrame{
	private JTree jtree;	
	
	public JTreeExam() {
		setTitle("제이트리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new JScrollPane(getJTree()),BorderLayout.CENTER);
		setSize(300,300);
	}

	private JTree getJTree() {
		if(jtree == null) {
			DefaultMutableTreeNode root = new DefaultMutableTreeNode("그룹리스트");
			DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("친구");
			node1.add(new DefaultMutableTreeNode("친구1"));
			node1.add(new DefaultMutableTreeNode("친구2"));
			root.add(node1);
			
			DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("회사동료");
			node2.add(new DefaultMutableTreeNode("동료1"));
			node2.add(new DefaultMutableTreeNode("동료2"));
			root.add(node2);
			
			jtree = new JTree(root);
			jtree.setCellRenderer(new MyTreeCellRenderer());
			jtree.addTreeSelectionListener(treeSelectionListener);
			jtree.addMouseListener(mouseListener);
			
		}
		return jtree;
	}
	
	private MouseListener mouseListener = new MouseAdapter() {
		public void mouseClicked(java.awt.event.MouseEvent e) {
			if(e.getClickCount()==2) {
				TreePath treePath = jtree.getPathForLocation(e.getX(), e.getY());
				DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) treePath.getLastPathComponent();
				String nodeText = (String) treeNode.getUserObject();
				JOptionPane.showMessageDialog(JTreeExam.this, "더블 클릭: " + nodeText);
			}
		}
	};
	
	
	
	
	private TreeSelectionListener treeSelectionListener = new TreeSelectionListener() {
		@Override 
		public void valueChanged(TreeSelectionEvent e) {
			TreePath treePath = e.getPath();
			DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) treePath.getLastPathComponent();
			String nodeText = (String) treeNode.getUserObject();
			JOptionPane.showMessageDialog(JTreeExam.this,"노드 변경:" + nodeText);
		}
	};
	
	
	public class MyTreeCellRenderer implements TreeCellRenderer {
		public Component getTreeCellRendererComponent(
				JTree tree,Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
			if(!leaf) {
				JLabel jLabel = new JLabel();
				jLabel.setBorder(BorderFactory.createEmptyBorder(5,0,5,0)); //상하간격
				jLabel.setIcon(new ImageIcon(getClass().getResource("icon2.jpg")));
				jLabel.setText(value.toString());
				return jLabel;
			}else {
				JPanel jPanel = new JPanel();
				jPanel.setBackground(Color.WHITE);
				jPanel.setLayout(new BorderLayout());
				jPanel.setBorder(BorderFactory.createEmptyBorder(3,0,3,0));
				
				JLabel lblWest = new JLabel(new ImageIcon(getClass().getResource("icon2.jpg")));
				JLabel lblCenter = new JLabel("  " + value.toString() + "  ");			
				JLabel lblEast = new JLabel(new ImageIcon(getClass().getResource("icon2.jpg")));
				jPanel.add(lblWest,BorderLayout.WEST);
				jPanel.add(lblCenter,BorderLayout.CENTER);
				jPanel.add(lblEast,BorderLayout.EAST);
				
				if(sel) {
					jPanel.setBackground(Color.ORANGE);
				}
				return jPanel;
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTreeExam jte = new JTreeExam();
				jte.setVisible(true);
			}
		});

	}

}

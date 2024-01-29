package swingExam.Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

public class JMenuExam extends JFrame{
	
	private JMenuBar jMenuBar;
	private JMenu menuFile,menuNew,menuHelp;
	private JMenuItem menuItemNewFile,menuItemNewFolder;
	private JMenuItem menuItemOpen, menuItemSave, menuItemExit;
	
	public JMenuExam() {
		setTitle("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(getJMenuBar());
		setSize(300,200);
	}
	
	public JMenuBar getJMenuBar() {
		if(jMenuBar == null) {
			jMenuBar = new JMenuBar();
			
			jMenuBar.add(getMenuFile());
			jMenuBar.add(getMenuHelp());
		}
		return jMenuBar;
		
	}
	

	private JMenu getMenuFile() {
		if(menuFile == null) {
			menuFile = new JMenu("파일");
			menuFile.add(getMenuNew());
			menuFile.add(getMenuItemOpen());
			menuFile.add(getMenuItemSave());
			menuFile.add(new JSeparator());
			menuFile.add(getMenuItemExit());		
		}
		return menuFile;
	}


	private JMenu getMenuHelp() {
		if(menuHelp == null) {
			menuHelp = new JMenu("도움말");
		}
		return menuHelp;
	}

	private JMenuItem getMenuNew() {
		if(menuNew == null) {
			menuNew = new JMenu("새로 만들기");
			menuNew.add(getMenuItemNewFile());
			menuNew.add(getMenuItemNewFolder());
		}
		return menuNew;
	}
	
	private JMenuItem getMenuItemNewFile() {
		if(menuItemNewFile == null) {
			menuItemNewFile = new JMenuItem("새 파일");
			
		}
		return menuItemNewFile;
	}
	
	private JMenuItem getMenuItemNewFolder() {
		if(menuItemNewFolder == null) {
			menuItemNewFolder = new JMenuItem("새 폴더");
			
		}
		return menuItemNewFolder;
	}

	private JMenuItem getMenuItemOpen() {
		if(menuItemOpen == null) {
			menuItemOpen = new JMenuItem("파일 열기");
		}
		return menuItemOpen;
	}

	private JMenuItem getMenuItemSave() {
		if(menuItemSave == null) {
			menuItemSave = new JMenuItem("파일 저장");
		}
		return menuItemSave;
	}

	private JMenuItem getMenuItemExit() {
		if(menuItemExit == null) {
			menuItemExit = new JMenuItem("종료");
		}
		return menuItemExit;
	}
	


	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JMenuExam jFrame = new JMenuExam();
					jFrame.setVisible(true);
			}
		});
	}

}



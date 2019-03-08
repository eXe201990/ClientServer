package ro.oldtech.agenda.client.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
// http://en-human-begin.blogspot.ro/2007/11/javas-icons-by-default.html

public class TestMenuBar extends JFrame {

	/**
	 * UIManager.getIcon("FileView.directoryIcon");
	 * UIManager.getIcon("FileView.fileIcon");
	 * UIManager.getIcon("FileView.computerIcon");
	 * UIManager.getIcon("FileView.hardDriveIcon");
	 * UIManager.getIcon("FileView.floppyDriveIcon");
	 * 
	 * UIManager.getIcon("FileChooser.newFolderIcon");
	 * UIManager.getIcon("FileChooser.upFolderIcon");
	 * UIManager.getIcon("FileChooser.homeFolderIcon");
	 * UIManager.getIcon("FileChooser.detailsViewIcon");
	 * UIManager.getIcon("FileChooser.listViewIcon");
	 */
	private static final long serialVersionUID = 5190206450890683421L;

	public TestMenuBar() {
		this.setSize(600, 600);
		this.setTitle("Meniu Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.setIcon(UIManager.getIcon("FileChooser.upFolderIcon"));
		// mntmOpen.setIcon(new ImageIcon(""));
		mnFile.add(mntmOpen);
		// mnFile.setIcon(new ImageIcon(""));

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setIcon(UIManager.getIcon("FileView.floppyDriveIcon"));
		mnFile.add(mntmSave);

		JMenuItem mntmClose = new JMenuItem("Close");

		mntmClose.setIcon(UIManager.getIcon("OptionPane.errorIcon"));
		mntmClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("EXIT CLICKED");
				System.exit(0);
			}
		});
		mnFile.add(mntmClose);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TestMenuBar();
	}

}

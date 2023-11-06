package GUISwing.MenuBar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrameForMenuBar extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyFrameForMenuBar() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		ImageIcon loadIcon = new ImageIcon("icons8-open-file-under-cursor-50.png");
		ImageIcon saveIcon = new ImageIcon("icons8-save-file-50.png");
		ImageIcon exitIcon = new ImageIcon("icons8-macos-close-50.png");
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
		
		JMenuItem loadItem = new JMenuItem("Load");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(e -> System.out.println("Item is loading"));
		saveItem.addActionListener(e -> System.out.println("Item saved"));
		exitItem.addActionListener(e -> System.exit(0));
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

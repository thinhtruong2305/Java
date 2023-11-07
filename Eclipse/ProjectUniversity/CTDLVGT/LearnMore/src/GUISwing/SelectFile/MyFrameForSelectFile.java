package GUISwing.SelectFile;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class MyFrameForSelectFile extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrameForSelectFile() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JButton button = new JButton("Select File");
		button.addActionListener(e -> {
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("."));
			
			int response = fileChooser.showOpenDialog(null);
			//int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		});
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

package GUISwing.CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrameForCheckBox extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JCheckBox checkBox;
	ImageIcon iconYes;
	ImageIcon iconNo;
	
	public MyFrameForCheckBox() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		iconNo = new ImageIcon("SpiderManNo.jpg");
		iconYes = new ImageIcon("anime.jpg");
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("Are you Fan Anime?");
		checkBox.setFocusable(false);
		checkBox.setIcon(iconNo);
		checkBox.setSelectedIcon(iconYes);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
	}
}

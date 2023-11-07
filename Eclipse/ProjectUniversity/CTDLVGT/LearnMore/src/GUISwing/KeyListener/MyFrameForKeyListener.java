package GUISwing.KeyListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrameForKeyListener extends JFrame implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	ImageIcon icon;
	
	public MyFrameForKeyListener() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("icons8-jigglypuff-48.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 48, 48);
		label.setBackground(Color.RED);
		label.setIcon(icon);
		label.setOpaque(true);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'a': 
			if(label.getX() != 0)
				label.setLocation(label.getX() - 10, label.getY()); 
			break;
		case 'd':
			if(this.getSize().width - label.getX() >= label.getWidth() + 25)
				label.setLocation(label.getX() + 10, label.getY());
			break;
		case 'w': 
			if(label.getY() != 0)
				label.setLocation(label.getX(), label.getY() - 10); 
			break;
		case 's': 
			if(this.getSize().height - label.getY() >= label.getHeight() + 50)
				label.setLocation(label.getX(), label.getY() + 10); 
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

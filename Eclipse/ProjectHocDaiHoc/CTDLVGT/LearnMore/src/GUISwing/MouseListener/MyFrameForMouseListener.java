package GUISwing.MouseListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrameForMouseListener extends JFrame implements MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;

	public MyFrameForMouseListener() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.setLayout(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You clicked a mouse");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You pressed a mouse");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You releaseed a mouse");
		label.setBackground(Color.cyan);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Entered a mouse");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Exited a mouse");
		label.setBackground(Color.red);
	}
}
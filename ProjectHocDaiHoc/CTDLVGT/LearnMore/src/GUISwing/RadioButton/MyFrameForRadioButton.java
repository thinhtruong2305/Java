package GUISwing.RadioButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrameForRadioButton extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotDogButton;

	public MyFrameForRadioButton() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		hotDogButton = new JRadioButton("HotDog");
		
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotDogButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

package GUI_Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrameForRadioButton extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotDogButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotDogIcon;
	
	public MyFrameForRadioButton() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//ImageIcon
		pizzaIcon = new ImageIcon("D:\\Users\\admin\\Pictures\\Ảnh cá nhân\\Icon\\icons8-pizza-64.png");
		hamburgerIcon = new ImageIcon("D:\\Users\\admin\\Pictures\\Ảnh cá nhân\\Icon\\icons8-hamburger-58.png");
		hotDogIcon = new ImageIcon("D:\\Users\\admin\\Pictures\\Ảnh cá nhân\\Icon\\icons8-hot-dog-58.png");
		
		//RadioButton
		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		hotDogButton = new JRadioButton("Hot Dog");
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotDogButton.setIcon(hotDogIcon);
		
		//Action listener
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotDogButton.addActionListener(this);
		
		//button group
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotDogButton);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotDogButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == pizzaButton) {
			System.out.println("You ordered pizza!");
		}else if(e.getSource() == hamburgerButton) {
			System.out.println("You ordered hamburger!");
		}else if(e.getSource() == hotDogButton) {
			System.out.println("You ordered hot dog!");
		}
	}
	
}

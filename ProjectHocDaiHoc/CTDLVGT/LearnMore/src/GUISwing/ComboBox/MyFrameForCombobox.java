package GUISwing.ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrameForCombobox extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrameForCombobox() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animal = {"Dog", "Cat", "Duck"};
		JComboBox<String> comboBox = new JComboBox<String>(animal);
		comboBox.addActionListener(e -> System.out.println(comboBox.getSelectedItem()));
		//comboBox.addActionListener(e -> System.out.println(comboBox.getSelectedIndex()));
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount());
		//comboBox.addItem("Horse");
		//comboBox.insertItemAt("Pig", 0);
		//comboBox.setSelectedIndex(0);
		//comboBox.removeItem("Dog");
		//comboBox.removeItemAt(2);
		//comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

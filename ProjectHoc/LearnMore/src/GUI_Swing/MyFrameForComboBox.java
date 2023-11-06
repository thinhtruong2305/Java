package GUI_Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrameForComboBox extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<String> comboBox;
	
	public MyFrameForComboBox() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//Mảng String
		String[] animal = {"Dog","Cat","Bird"};
		
		//ComboBox
		comboBox = new JComboBox<>(animal);
		comboBox.addActionListener(this);
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount());
		//comboBox.addItem("Horse");
		//comboBox.insertItemAt("Pig", 0);
		//comboBox.setSelectedItem(0);
		//comboBox.removeItem("Cat");
		//comboBox.removeItemAt(0);
		//comboBox.removeAllItems();
		
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == comboBox) {
			//System.out.println(comboBox.getSelectedIndex());
			System.out.println(comboBox.getSelectedItem());
		}
	}

}

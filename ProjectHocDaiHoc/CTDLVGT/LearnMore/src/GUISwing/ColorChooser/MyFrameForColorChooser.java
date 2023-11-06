package GUISwing.ColorChooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrameForColorChooser extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyFrameForColorChooser() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		label.setBackground(Color.WHITE);
		label.setText("Trương Văn Tiến Thịnh");
		label.setOpaque(true);
		
		JButton button = new JButton("Choose the color");
		button.addActionListener(e -> {
			Color color = JColorChooser.showDialog(null, "Color", Color.BLACK);
			
			label.setForeground(color);
		});
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

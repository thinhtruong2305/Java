package GUISwing.LayeredPane;

import java.awt.*;
import javax.swing.*;

public class Lesson_8_LayeredPane {
	public static void main(String[] args) {
		//tạo label 
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150, 150, 200, 200);
		
		// tạo layerPane
		JLayeredPane layerPane = new JLayeredPane();
		layerPane.setBounds(0, 0, 500, 500);
		layerPane.add(label1, Integer.valueOf(0));//JLayeredPane.DEFAULT_LAYER
		layerPane.add(label2, Integer.valueOf(2));//JLayeredPane.DEFAULT_LAYER
		layerPane.add(label3, Integer.valueOf(1));//JLayeredPane.DRAG_LAYER
		
		// khung
		JFrame frame = new JFrame("JLayeredPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		frame.add(layerPane);
		frame.setVisible(true);
	}
}

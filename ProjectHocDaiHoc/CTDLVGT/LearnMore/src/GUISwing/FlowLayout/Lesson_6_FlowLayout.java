package GUISwing.FlowLayout;

import java.awt.*;
import javax.swing.*;

public class Lesson_6_FlowLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//nút thoát
		frame.setSize(500, 500);//kích cỡ
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));// layout dòng chảy (chảy như thế nào, horizone,vertical)
		
		//panel
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		
		//các nút
		panel.add(new Button("1"));
		panel.add(new Button("2"));
		panel.add(new Button("3"));
		panel.add(new Button("4"));
		panel.add(new Button("5"));
		panel.add(new Button("6"));
		panel.add(new Button("7"));
		panel.add(new Button("8"));
		panel.add(new Button("9"));
		
		frame.add(panel);//thêm panel
		frame.setVisible(true);//có thể nhìn thấy
	}
}

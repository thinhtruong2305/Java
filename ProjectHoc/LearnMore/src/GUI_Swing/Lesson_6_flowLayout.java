package GUI_Swing;

import javax.swing.*;
import java.awt.*;

public class Lesson_6_flowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		//nút thoát
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//kích cỡ
		frame.setSize(500, 500);
		// layout dòng chảy (chảy như thế nào, horizone,vertical)
		//frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		//panel
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(500,500));
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

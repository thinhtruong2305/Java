package GUI_Swing;

import javax.swing.*;
import java.awt.*;

public class Lesson_7_gridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo khung
		JFrame frame = new JFrame();
		//nút thoát
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//kích cỡ
		frame.setSize(500, 500);
		//tạo layout (hàng, cột, khoảng cách dọc ,khoảng cách ngang
		frame.setLayout(new GridLayout(3,3,10,10));
		
		//các nút
		frame.add(new Button("1")); 
		frame.add(new Button("2"));
		frame.add(new Button("3"));
		frame.add(new Button("4"));
		frame.add(new Button("5"));
		frame.add(new Button("6"));
		frame.add(new Button("7"));
		frame.add(new Button("8"));
		frame.add(new Button("9"));
		frame.add(new Button("10"));
		
		frame.setVisible(true);// nhìn thấy được
	}

}

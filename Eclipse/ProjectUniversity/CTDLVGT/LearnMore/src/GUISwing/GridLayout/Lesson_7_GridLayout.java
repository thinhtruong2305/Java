package GUISwing.GridLayout;

import java.awt.*;
import javax.swing.*;

public class Lesson_7_GridLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();//tạo khung
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//nút thoát
		frame.setSize(500, 500);//kích cỡ
		frame.setLayout(new GridLayout(3,3,10,10));//tạo layout (hàng, cột, khoảng cách d�?c ,khoảng cách ngang
		
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

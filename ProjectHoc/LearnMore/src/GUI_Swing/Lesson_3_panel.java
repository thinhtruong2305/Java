package GUI_Swing;

import javax.swing.*;
import java.awt.*;

public class Lesson_3_panel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tạo hình ảnh dựa trên tên file
		ImageIcon icon = new ImageIcon("anime.jpg");
		
		// tạo label
		JLabel label = new JLabel();
		// thêm chữ
		label.setText("HI");
		// thêm hình
		label.setIcon(icon);
		// chỉnh vị trí chữ(phải trái giữa)
		label.setHorizontalTextPosition(JLabel.CENTER);
		// Chỉnh vị trí chữ (trên giữa dưới)
		label.setVerticalTextPosition(JLabel.TOP);
		// màu chữ
		label.setForeground(Color.CYAN);
		// phông chữ
		label.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 50));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		// tạo panel đỏ
		JPanel redPanel = new JPanel();
		// đặt màu nền
		redPanel.setBackground(Color.RED);
		// đặt vị trí
		redPanel.setBounds(0, 0, 250, 250);
		
		// tạo panel xanh
		JPanel bluePanel = new JPanel();
		// đặt màu nền
		bluePanel.setBackground(Color.blue);
		// đặt vị trí
		bluePanel.setBounds(250, 0, 250, 250);
		
		// tạo panel xanh lá cây
		JPanel greenPanel = new JPanel();
		// đặt màu nền
		greenPanel.setBackground(Color.green);
		// đặt vị trí
		greenPanel.setBounds(250, 250, 600, 600);
		greenPanel.setLayout(new BorderLayout());
		
		// tạo khung
		JFrame frame = new JFrame();
		//tạo nút thoát
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// đặt layout hay không
		frame.setLayout(null);
		// kích cỡ khung nhìn
		frame.setSize(750, 750);
		// nhìn thấy được hay không
		frame.setVisible(true);
		// thêm label
		greenPanel.add(label);
		//thêm panel đỏ
		frame.add(redPanel);
		//thêm panel xanh
		frame.add(bluePanel);
		//thêm panel xanh lá cây
		frame.add(greenPanel);
	}

}

package GUISwing.Panel;

import java.awt.*;
import javax.swing.*;

public class Lesson_3_Panel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon icon = new ImageIcon("27073039_216362665577589_8027399148713754298_n.jpg");// tạo hình ảnh dựa trên tên file
		
		JLabel label = new JLabel();// tạo label
		label.setText("HI");// thêm chữ
		label.setIcon(icon);// thêm hình
		label.setHorizontalTextPosition(JLabel.CENTER);// chỉnh vị trí chữ(phải trái giữa)
		label.setVerticalTextPosition(JLabel.TOP);// Chỉnh vị trí chữ (trên giữa dưới)
		label.setForeground(Color.CYAN);// màu chữ
		label.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 50));// phông chữ
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel redPanel = new JPanel();// tạo panel đ�?
		redPanel.setBackground(Color.RED);// đặt màu n�?n
		redPanel.setBounds(0, 0, 250, 250);// đặt vị trí
		
		JPanel bluePanel = new JPanel();// tạo panel xanh
		bluePanel.setBackground(Color.blue);// đặt màu n�?n
		bluePanel.setBounds(250, 0, 250, 250);// đặt vị trí
		
		JPanel greenPanel = new JPanel();// tạo panel xanh lá cây
		greenPanel.setBackground(Color.green);// đặt màu n�?n
		greenPanel.setBounds(250, 250, 600, 600);// đặt vị trí
		greenPanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();// tạo khung
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//tạo nút thoát
		frame.setLayout(null);// đặt layout hay không
		frame.setSize(750, 750);// kích cỡ khung nhìn
		frame.setVisible(true);// nhìn thấy được hay không
		greenPanel.add(label);// thêm label
		frame.add(redPanel);//thêm panel đ�?
		frame.add(bluePanel);//thêm panel xanh
		frame.add(greenPanel);//thêm panel xanh lá cây
	}

}

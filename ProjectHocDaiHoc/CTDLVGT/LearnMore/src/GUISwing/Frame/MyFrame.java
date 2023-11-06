package GUISwing.Frame;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(){
		this.setTitle("Title gose here");//tạo tiêu đ�?
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//tạo nút thoát có thể có nhi�?u trư�?ng hợp (như HIDE_ON_CLOSE hay DO_NOTHING_ON_CLOSE ...)
		this.setResizable(true);//tránh việc ngư�?i dùng đi�?u chỉnh kích thước khung
		this.setSize(500,500);//đặt độ dài cho tung độ, hoành độ
		this.setVisible(true);//làm khung có thể nhìn thấy được
		
		ImageIcon image = new ImageIcon("27073039_216362665577589_8027399148713754298_n.jpg");//tạo logo
		this.setIconImage(image.getImage());//đổi icon của this bằng icon của mình
		this.getContentPane().setBackground(Color.green);//đổi màu n�?n
		this.getContentPane().setBackground(new Color(255, 255, 25));//đổi màu n�?n
		this.getContentPane().setBackground(new Color(0xFFFFFF));//đổi màu n�?n
	}
}

package GUI_Swing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyFrame(){
		//tạo tiêu đề
		this.setTitle("Title gose here");
		//tạo nút thoát có thể có nhiều trường hợp (như HIDE_ON_CLOSE hay DO_NOTHING_ON_CLOSE ...)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//tránh việc người dùng điều chỉnh kích thước khung
		this.setResizable(true);
		//đặt độ dài cho tung độ, hoành độ
		this.setSize(500,500);
		//làm khung có thể nhìn thấy được
		this.setVisible(true);
		
		//tạo logo
		ImageIcon image = new ImageIcon("anime.jpg");
		//đổi icon của this bằng icon của mình
		this.setIconImage(image.getImage());
		//đổi màu nền
		this.getContentPane().setBackground(Color.green);
		//đổi màu nền
		this.getContentPane().setBackground(new Color(255, 255, 25));
		//đổi màu nền
		this.getContentPane().setBackground(new Color(0xFFFFFF));
	}
	
}

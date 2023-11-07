package GUISwing.Label;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Lesson_2_Labels {
	public static void main(String[] args) {
		ImageIcon image = new ImageIcon("27073039_216362665577589_8027399148713754298_n.jpg");//tạo icon
		Border border = BorderFactory.createLineBorder(Color.GREEN,3);//tạo khung vi�?n
		
		JLabel label = new JLabel();//Tạo label//có thể setText ngay hàm tạo
		label.setText("Hello my Friend");//set text label
		label.setIcon(image);//thêm ảnh icon
		label.setHorizontalTextPosition(JLabel.CENTER);// đưa chữ vào giữa icon (Chỉnh trái,phải,giữa)
		label.setVerticalTextPosition(JLabel.TOP);// đưa chữ nằm trên, dưới, giữa hình
		label.setForeground(Color.CYAN);//chỉnh màu chữ
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));//chỉnh phông chữ, kiểu chữ, size chữ
		label.setIconTextGap(10);//chỉnh chữ xa gần ảnh bao nhiêu (dương là xa, âm là gần)
		label.setBackground(Color.BLACK);//tạo màu background nhưng chưa hiển thị cần dòng lệnh sau
		label.setOpaque(true);// dòng lệnh này sẽ hiển thị background mà bạn ch�?n trên
		label.setBorder(border);// set boder vừa tạo
		label.setVerticalAlignment(JLabel.CENTER);//sẽ làm cho label theo các khu vực chỉnh định (trên dưới giữa)
		label.setHorizontalAlignment(JLabel.CENTER);//sẽ làm cho label theo các khu vực chỉnh đinh (trái giữa phải)
		//label.setBounds(100, 100, 600, 600);//để khắc phục lỗi (1) có thể cho label hiện trên khung n�?n trống bằng việc chỉ định vị trí, kích thước
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//tạo nút thoát
		//frame.setLayout(null);// sẽ làm mất nội dung trong nếu null (1)
		//frame.setSize(800, 800);//chỉnh kích cỡ
		frame.setVisible(true);// Chỉnh có thể nhìn thấy
		frame.add(label);//thêm label//nhớ thêm một vật gì thì mới pack dc
		frame.pack();//tự động đi�?u chỉnh vừa với layout của một vật được thêm
	}
}

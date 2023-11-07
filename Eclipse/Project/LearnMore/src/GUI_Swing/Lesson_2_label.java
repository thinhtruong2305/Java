package GUI_Swing;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Lesson_2_label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tạo icon
		ImageIcon image = new ImageIcon("anime.jpg");
		//tạo khung viền
		Border border = BorderFactory.createLineBorder(Color.GREEN,3);
		
		//Tạo label//có thể setText ngay hàm tạo
		JLabel label = new JLabel();
		//set text label
		label.setText("Hello my Friend");
		//thêm ảnh icon
		label.setIcon(image);
		//đưa chữ vào giữa icon (Chỉnh trái,phải,giữa)
		label.setHorizontalTextPosition(JLabel.CENTER);
		//đưa chữ nằm trên, dưới, giữa hình
		label.setVerticalTextPosition(JLabel.TOP);
		//chỉnh màu chữ
		label.setForeground(Color.CYAN);
		//chỉnh phông chữ, kiểu chữ, size chữ
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		//chỉnh chữ xa gần ảnh bao nhiêu (dương là xa, âm là gần)
		label.setIconTextGap(10);
		//tạo màu background nhưng chưa hiển thị cần dòng lệnh sau
		label.setBackground(Color.BLACK);
		// dòng lệnh này sẽ hiển thị background mà bạn chọn trên
		label.setOpaque(true);
		// set boder vừa tạo ở dòng 14
		label.setBorder(border);
		//sẽ làm cho label theo các khu vực chỉnh định (trên dưới giữa)
		label.setVerticalAlignment(JLabel.CENTER);
		//sẽ làm cho label theo các khu vực chỉnh đinh (trái giữa phải)
		label.setHorizontalAlignment(JLabel.CENTER);
		;//để khắc phục lỗi (1) có thể cho label hiện trên khung nền trống bằng việc chỉ định vị trí, kích thước
		//label.setBounds(100, 100, 600, 600)
		
		JFrame frame = new JFrame();
		//tạo nút thoát
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// sẽ làm mất nội dung trong nếu null (1)
		//frame.setLayout(null);
		//chỉnh kích cỡ
		//frame.setSize(800, 800);
		// Chỉnh có thể nhìn thấy
		frame.setVisible(true);
		//thêm label//nhớ thêm một vật gì thì mới pack dc
		frame.add(label);
		//tự động điều chỉnh vừa với layout của một vật được thêm
		frame.pack();
	}
}

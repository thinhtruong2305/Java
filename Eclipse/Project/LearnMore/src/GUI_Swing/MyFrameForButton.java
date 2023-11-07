package GUI_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrameForButton extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;
	
	public MyFrameForButton() {
		ImageIcon icon = new ImageIcon("anime.jpg");
		
		label = new JLabel(icon);
		label.setBounds(250, 250, 300, 300);
		label.setVisible(false);
		
		// tạo nút bấm
		button = new JButton();
		// đặt vị trí nút
		button.setBounds(100, 100, 300, 50);
		// hành động
		//button.addActionListener(e -> System.out.println("poo"));
		// cách này dùng cái hàm ghi đè dưới
		button.addActionListener((ActionListener) this);
		// tạo chữ
		button.setText("Button");
		// chỉnh trạng thái như bấm vô true tự động chuyển về giá trị mình muốn
		button.setFocusable(false);
		// vị trí chữ
		button.setHorizontalTextPosition(JButton.CENTER);
		//vị trí chữ
		button.setVerticalTextPosition(JButton.CENTER);
		// phông chữ
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		// tạo màu chữ
		button.setForeground(Color.CYAN);
		// tạo màu nền
		button.setBackground(Color.darkGray);
		// tạo khung
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			//System.out.println("poo");
			//button.setEnabled(false);// bấm một lần thì để vô
			label.setVisible(true);
		}
	}
	
}

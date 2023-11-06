package GUISwing.Button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrameForButton extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;

	MyFrameForButton(){
		ImageIcon icon = new ImageIcon("27073039_216362665577589_8027399148713754298_n.jpg");
		
		label = new JLabel(icon);
		label.setBounds(250, 250, 300, 300);
		label.setVisible(false);
		
		button = new JButton();// tạo nút bấm
		button.setBounds(100, 100, 300, 50);// đặt vị trí nút
		//button.addActionListener(e -> System.out.println("poo"));// hành động
		button.addActionListener(this);// cách này dùng cái hàm ghi đè dưới
		button.setText("Button");// tạo chữ
		button.setFocusable(false);// chỉnh trạng thái như bấm vô true tự động chuyển v�? giá trị mình muốn
		button.setHorizontalTextPosition(JButton.CENTER);// vị trí chữ
		button.setVerticalTextPosition(JButton.CENTER);//vị trí chữ
		button.setFont(new Font("Tahoma", Font.BOLD, 20));// phông chữ
		button.setForeground(Color.CYAN);// tạo màu chữ
		button.setBackground(Color.darkGray);// tạo màu n�?n
		button.setBorder(BorderFactory.createEtchedBorder());// tạo khung
		
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

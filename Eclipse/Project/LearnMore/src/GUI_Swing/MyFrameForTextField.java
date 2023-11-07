package GUI_Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrameForTextField extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton button;
	JTextField textField;
	
	public MyFrameForTextField() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//nút thoát
		this.setLayout(new FlowLayout());//layout
		
		// nút bấm
		button = new JButton("nhập");
		button.addActionListener(this);
		
		//text field
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Time New Roman", Font.PLAIN, 35));
		textField.setForeground(Color.DARK_GRAY);
		textField.setBackground(Color.WHITE);
		textField.setCaretColor(Color.GRAY);
		textField.setText("User Name");
		
		//thêm vào khung
		this.add(textField);
		this.add(button);
		
		this.pack();//kích thước
		this.setVisible(true);//nhìn thấy dc
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(textField.getText());
			button.setEnabled(false);
			textField.setEditable(false);
		}
	}
}

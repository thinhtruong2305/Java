package GUI_Swing;

import javax.swing.*;
import java.awt.event.*;

public class MyFrame_LaunchWindow_ForOpenNewWindow implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton("New Window");
	
	public MyFrame_LaunchWindow_ForOpenNewWindow(){
		//nút
		button.setBounds(100, 100, 200, 50);
		button.setFocusable(false);
		button.addActionListener(this);
		//thêm nút vào khung
		frame.add(button);
		//khung
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) {
			frame.dispose();
			new MyFrame_NewWindow_ForOpenNewWindow();
		}
	}
}

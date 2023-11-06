package GUI_Swing;

import javax.swing.*;
import java.awt.*;

public class MyFrame_NewWindow_ForOpenNewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("hello");
	
	public MyFrame_NewWindow_ForOpenNewWindow() {
		//label
		label.setBounds(0, 0, 100, 100);
		label.setFont(new Font(null, Font.PLAIN, 30));
		//thêm label vào khung
		frame.add(label);
		//khung
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

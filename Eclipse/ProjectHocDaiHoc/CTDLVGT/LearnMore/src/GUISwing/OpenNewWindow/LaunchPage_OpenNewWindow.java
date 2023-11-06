package GUISwing.OpenNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LaunchPage_OpenNewWindow implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("New Window");
	
	public LaunchPage_OpenNewWindow() {
		//nút
		button.setBounds(100, 100, 100, 50);
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
			new NewWindow_OpenNewWindow();
		}
	}
}

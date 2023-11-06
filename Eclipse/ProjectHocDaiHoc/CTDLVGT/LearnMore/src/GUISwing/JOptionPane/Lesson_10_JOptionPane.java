package GUISwing.JOptionPane;

import javax.swing.*;

public class Lesson_10_JOptionPane {
	public static void main(String[] args) {
		// thông điệp
		//JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "this is some useless info dude", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "REALLY DUDE!!!", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "NOW YOUR COMPUTER HAS A VIRUS!!", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "WHAT CHA DOING WITH ME???", "title", JOptionPane.ERROR_MESSAGE);
	
		//xác nhận
		//int answer = JOptionPane.showConfirmDialog(null, "Thịnh gi�? nghe l�?i không?", "Cảnh cáo", JOptionPane.YES_NO_CANCEL_OPTION);
		//Ghi vô
		//String name = JOptionPane.showInputDialog("What's your name: ");
		//Ch�?n lựa
		ImageIcon icon = new ImageIcon("27073039_216362665577589_8027399148713754298_n.jpg");
		String []responses = {"No, you're awesome","Thank you!","blush"};
		JOptionPane.showOptionDialog(null, "You're great", "Serect Messange", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
	}
}

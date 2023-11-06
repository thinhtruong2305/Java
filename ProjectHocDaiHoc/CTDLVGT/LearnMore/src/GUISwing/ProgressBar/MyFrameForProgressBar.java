package GUISwing.ProgressBar;

import java.awt.*;
import javax.swing.*;

public class MyFrameForProgressBar {
	JFrame frame = new JFrame("Progress bar");
	JProgressBar progressBar = new JProgressBar(0, 500);
	
	public MyFrameForProgressBar() {
		progressBar.setValue(0);
		progressBar.setBounds(0, 0, 420, 50);
		progressBar.setStringPainted(true);
		progressBar.setString(progressBar.getMaximum() + " HP /" + progressBar.getMaximum() + " HP");
		progressBar.setValue(progressBar.getMaximum());
		progressBar.setFont(new Font("MV Boli", Font.PLAIN, 15));
		progressBar.setForeground(Color.red);
		progressBar.setBackground(Color.black);
		
		frame.add(progressBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}

	public void fill() {
		// TODO Auto-generated method stub
		int counter = progressBar.getMaximum();
		while (counter >= 0) {
			progressBar.setString(progressBar.getMaximum() + " HP /" + counter + " HP");
			progressBar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter--;
		}
		System.out.println("You Died");
	}
}

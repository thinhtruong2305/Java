package GUISwing.Slider;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class MyFrameForSlider implements ChangeListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	public MyFrameForSlider() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);
		
		slider.setPreferredSize(new Dimension(200, 200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		//slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("Hello");
		label.setFont(new Font("Times New Roman", Font.PLAIN, slider.getValue()));
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setFont(new Font("Times New Roman", Font.PLAIN, slider.getValue()));
	}
	
}

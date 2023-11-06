package GUISwing.DragAndDrop;

import java.awt.color.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrameForDragAndDrop extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DragPanel dragPanel;
	
	public MyFrameForDragAndDrop() {
		this.add(dragPanel);
		this.setTitle("Drag & Drop");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

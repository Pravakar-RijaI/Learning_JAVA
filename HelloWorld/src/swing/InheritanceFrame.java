package swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class InheritanceFrame extends JWindow
{
	JPanel panel;
	
	public InheritanceFrame()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		
	}

	public static void main(String[] args) {
		InheritanceFrame frame = new InheritanceFrame();

	}

}

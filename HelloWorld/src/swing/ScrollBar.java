package swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class ScrollBar {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("My Frame");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout());
		
		JScrollBar bar = new JScrollBar();
		
		
		frame.add(bar,BorderLayout.EAST);
		
	}

}

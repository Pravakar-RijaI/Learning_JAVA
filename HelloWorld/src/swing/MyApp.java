package swing;

import javax.swing.*;

public class MyApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Frame");
		frame.setVisible(true);
		frame.setLocation(400,200);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

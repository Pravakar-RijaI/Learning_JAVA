package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyFrame {

	public static void main(String[] args) {
		Frame fr = new Frame("My Frame");
		fr.setLayout(new FlowLayout());
		
		Button btn = new Button("Ok");
		fr.add(btn);
		
		fr.setSize(300,300);
		fr.setLocation(400,200);
		fr.setVisible(true);
	}

}

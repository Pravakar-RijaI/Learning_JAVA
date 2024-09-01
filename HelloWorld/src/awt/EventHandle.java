package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class EventHandle {

	public static void main(String[] args) {
		int count = 0;
		Frame frame = new Frame("Button Test");
		frame.setLayout(new FlowLayout());
		
		Label label = new Label("0"); 
		Button btn = new Button("Click");
		
		frame.add(label);
		frame.add(btn);
		
		frame.setSize(300,300);
		frame.setLocation(400,200);
		frame.setVisible(true);

	}

}

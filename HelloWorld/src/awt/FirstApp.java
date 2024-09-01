package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class FirstApp extends Frame
{
	Button btn;
	TextField txtF;
	Label label;
	
	public FirstApp()
	{
		super("First Application");
		
		setLayout(new FlowLayout());
		
		btn = new Button("Click");
		txtF = new TextField();
		label = new Label("Name");
		
		add(label);
		add(txtF);
		add(btn);
		
		setLocation(400,200);
		setSize(500,500);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		FirstApp app = new FirstApp();
	}

}

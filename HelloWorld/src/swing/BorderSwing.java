package swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.border.Border;

public class BorderSwing {
	
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("My Frame");
		myFrame.setLocation(400,200);
		myFrame.setSize(500,500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(16,1));
		
		//Add ToolBar
		JToolBar bar = new JToolBar();
		
		JButton button1 = new JButton("File");
		
		JButton button2 = new JButton("Edit");
		
		JButton button3 = new JButton("Help");
		
		bar.add(button1);
		bar.addSeparator();
		bar.add(button2);
		bar.addSeparator();
		bar.add(button3);
		
		
		
		//Add Border
		JLabel label = new JLabel("Enter a Message:");
		Border blackLine = BorderFactory.createLineBorder(Color.black);
		JTextArea area = new JTextArea(10, 20);
		area.setBorder(blackLine);
		
		//Add ToolTip
		area.setToolTipText("Please Add Some Feedback.");	
		
		//Add slider
		JSlider slider = new JSlider();
		
		myFrame.add(bar);
		myFrame.add(label);
		myFrame.add(area);
		myFrame.add(slider);

		myFrame.setVisible(true);
	}

}

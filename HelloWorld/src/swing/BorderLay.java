package swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLay extends JFrame
{
	JPanel p1,p2,p3,p4,p5;
	
	public BorderLay()
	{
		setVisible(true);
		setTitle("My Frame");
		setSize(500,500);
		setLocation(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(3,5));
		
		p1 = new JPanel();
		p1.setBackground(Color.yellow);
		
		p2 = new JPanel();
		p2.setBackground(Color.red);
		
		p3 = new JPanel();
		p3.setBackground(Color.blue);
		
		p4 = new JPanel();
		p4.setBackground(Color.green);
		
		p5 = new JPanel();
		p5.setBackground(Color.orange);
		
		add(p1,BorderLayout.EAST);
		add(p2,BorderLayout.WEST);
		add(p3,BorderLayout.NORTH);
		add(p4,BorderLayout.SOUTH);
		add(p5);
		
		
	}
	public static void main(String[] args) {
		BorderLay frame = new BorderLay();
	}

}

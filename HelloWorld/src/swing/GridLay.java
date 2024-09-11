package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLay extends JFrame
{
JPanel p1,p2,p3,p4,p5;
	
	public GridLay()
	{
		setVisible(true);
		setTitle("My Frame");
		setSize(500,500);
		setLocation(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout());
		
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
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
	}
		

	public static void main(String[] args) {
		GridLay frame = new GridLay();

	}

}

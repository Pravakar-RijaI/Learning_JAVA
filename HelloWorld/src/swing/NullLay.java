package swing;


import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NullLay extends JFrame
{
JPanel p1,p2,p3,p4,p5;
	
	public NullLay()
	{
		setVisible(true);
		setTitle("My Frame");
		setSize(500,500);
		setLocation(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		p1 = new JPanel();
		p1.setBackground(Color.yellow);
		p1.setBounds(3,4,100,200);
		
//		p2 = new JPanel();
//		p2.setBackground(Color.red);
//		
//		p3 = new JPanel();
//		p3.setBackground(Color.blue);
//		
//		p4 = new JPanel();
//		p4.setBackground(Color.green);
//		
//		p5 = new JPanel();
//		p5.setBackground(Color.black);
//		
//		add(p5);
		add(p1);
//		add(p2);
//		add(p3);
//		add(p4);
	}
		

	public static void main(String[] args) {
		NullLay frame = new NullLay();

	}

}

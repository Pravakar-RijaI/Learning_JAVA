package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.ProgressMonitorInputStream;

public class ProgressBar {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		frame1.setVisible(true);
		frame1.setTitle("Frame1");
		frame1.setSize(500,500);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(new FlowLayout());
		
		JProgressBar progressbar = new JProgressBar();
progressbar.setStringPainted(true);
		
		frame1.add(progressbar);
		try
		{
			for(int i = 0; i < 100; i++)
			{
				progressbar.setValue(i);
				Thread.sleep(1000);
			}			
			
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		
	}

}

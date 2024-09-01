package javabook;

public class RunnableThread implements Runnable
{
	Thread t;
	
	RunnableThread()
	{
		t = new Thread();
	}

		
	public void run()
	{
		try
		{
			for(int i = 0; i < 5; i ++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
			
		}catch(InterruptedException e)
		{
			System.out.println("Exception Caught: " + e);
		}
		
	}
	public static void main(String[] args) {
		RunnableThread T1 = new RunnableThread();
		T1.t.start();
		try
		{
			
			for(int i = 0; i < 5; i ++)
			{
				System.out.println(i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error: " + e);
		}

	}

}

package javabook;

public class NestedException {
	
	public static void main(String[] args)
	{
		try
		{
			//int a = 1/0;
			
			try
			{
				//int a = 1/0;
				int c = args.length;
				int[] b = new int[c];
				b[43] = 23;
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

}

package javabook;

public class ThrowException {
	public static void exceptDemo()
	{
		try
		{
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Error: " + e.getMessage());
			throw e;
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting Program");
		
		try
		{
			ThrowException.exceptDemo();
		}
		catch(NullPointerException e)
		{
			System.out.println("Error: " + e);
		}
	}

}

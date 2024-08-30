package javabook;

public class ThrowsException {
	
	public static void demo() throws IllegalAccessException
	{
		throw new IllegalAccessException();
	}

	public static void main(String[] args) {
		try
		{
			demo();		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

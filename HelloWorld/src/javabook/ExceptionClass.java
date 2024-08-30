package javabook;

public class ExceptionClass {

	public static void main(String[] args) {
		try
		{
			int a = 1;
			int b = a/0;
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		finally
		{
			System.out.println("Memory Released..");
		}

	}

}

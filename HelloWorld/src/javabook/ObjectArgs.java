package javabook;

public class ObjectArgs {
	private int number;
	
	public ObjectArgs(int number)
	{
		this.number = number;
	}
	
	public static void passByValue(int number)
	{
		number = 30;
		System.out.println("In method1\nNumber: " + number);
	}
	
	public static void passByRef(ObjectArgs obj)
	{
		obj.number = 23;
		System.out.println("In method2\nNumber: " + obj.number);
	}
	
	public void display()
	{
		System.out.println("In display method\nNumber: " + this.number);
	}

}

package javabook;

public class ReturnObjects {
	private int a;
	
	public ReturnObjects(int a)
	{
		this.a = a;
	}
	
	public ReturnObjects IncreBy(ReturnObjects obj)
	{
		return new ReturnObjects(obj.a + 10);
	}
	
	public void display()
	{
		System.out.println("a: " + this.a);
	}
}

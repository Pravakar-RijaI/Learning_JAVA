package javabook;

public class NestedClass {
	private int x;
	
	public NestedClass(int x)
	{
		this.x = x;
	}
	
	public void test()
	{
		InnerCase inner = new InnerCase();
		inner.display();
	}
	public class InnerCase
	{
		public void display()
		{
			System.out.println("This is displayed." + x);
		}
	}
	
	public static void main(String[] args)
	{
		NestedClass nestedClass = new NestedClass(24);
		nestedClass.test();
	}

}

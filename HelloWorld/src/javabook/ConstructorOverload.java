package javabook;

public class ConstructorOverload {
	
	private int num1;
	private int num2;
	
	public ConstructorOverload() 
	{
		this.num1 = -1;
		this.num2 = -1;
	}
	
	public ConstructorOverload(int num1)
	{
		this.num1 = num1;
		this.num2 = -1;
	}
	
	public ConstructorOverload(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void display() 
	{
		System.out.println("Hello, Iam " + this.num1 + " and this is my friend " + this.num2);
	}

}

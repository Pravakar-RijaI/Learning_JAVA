package javabook;

public class MethodOverload {
	private String name;
	
	public MethodOverload(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("This is " + this.name + ". Nice to meet you sir.");
	}
	
	public void display(int age)
	{
		System.out.println("This is " + this.name + " and Iam " + age + " years old."); 
	}
	
	public void display(String friend, int age)
	{
		System.out.println("This is " + this.name + " and this is my friend, " + friend + ". He is of age " + age);
	}
	
	public void display (int age, String friend)
	{
		System.out.println("This is " + this.name + " and Iam " + age + "years old. This is my friend " + friend);
	}

}

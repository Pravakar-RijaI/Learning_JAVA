package classPrograms;

public class BaseClass {
	public int i;
	
	public BaseClass()
	{
		this.i = -1;
	}
	public BaseClass(int i)
	{
		this.i = i;
	}
	
	public void display()
	{
		System.out.println("Hi! Iam " + this.i);
	}

}

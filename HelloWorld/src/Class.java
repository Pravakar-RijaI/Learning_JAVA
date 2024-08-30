class ClassA
{
	private int num;
	
	public ClassA(int num)
	{
		this.num = num;
	}

	public void display()
	{
		System.out.println("Num: " + this.num);
	}
}

class ClassB
{
	private int num1;

	public ClassB(int num1)
	{
		this.num1 = num1;
	}
	
	public void display()
	{
		System.out.println("Num1: " + this.num1);
	}

	public static void main(String[] args)
	{
		ClassA A = new ClassA(32);
		ClassB B = new ClassB(23);
		A.display();
		B.display();
	}
}
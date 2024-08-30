package javabook;

public class ReferenceClass {
	public int num1;
	
	public ReferenceClass(int num)
	{
		num1 = num;
	}
	
	public void display()
	{
		System.out.println(this.num1);
	}
	
	public static void main(String[] args)
	{
		ReferenceClass C1 = new ReferenceClass(30);
		C1.display();
		ReferenceClass C2 = C1;
		C2.display();
		C2.num1 = 20;
		C1.display();
		C2.display();
		C2 = null;
		C1.display();
		//C2.display();
	}

}



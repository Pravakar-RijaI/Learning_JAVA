package javabook;

public class StaticFeat {
	private final static int a = 69;
	
//	public StaticFeat(int a)
//	{
//		this.a = a;
//	}
	
//	public void setA (int x)
//	{
//		a = x;
//	}
	
	public static void introduce()
	{
		System.out.println("Hello");
	}
	
	public void display()
	{
		//this.a = 34;
		System.out.println(a);
	}

	public static void main(String[] args) {
		StaticFeat S1 = new StaticFeat();
		S1.display();
		//		S1.setA(23);
//		S1.display();
//		
//		StaticFeat S2 = new StaticFeat();
//		S2.display();

	}

}

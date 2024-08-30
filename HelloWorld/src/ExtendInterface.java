interface A
{
	default void method1()
	{
		System.out.println("Method1");
	}
	
	void method2();
}

interface B extends A
{
	default void method1()
	{
		System.out.println("Method3");
	}
	void method4();
}
public class ExtendInterface implements B
{
	
//	public void method1()
//	{
//		System.out.println("Method1");
//	}
	
	public void method2()
	{
		System.out.println("Method2");
	}
	
	
	public void method4()
	{
		System.out.println("Method4");
	}

	public static void main(String[] args) {
		A a = new ExtendInterface();
		a.method1();
		a.method2();
		//a.method3();

	}

}

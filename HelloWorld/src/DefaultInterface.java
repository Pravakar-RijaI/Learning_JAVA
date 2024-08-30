interface MyIf
{
	void getNumber();
	
	default String getString()
	{
		return "Default String";
	}
}

public class DefaultInterface implements MyIf 
{
	public void getNumber()
	{
		System.out.println("Number 07");
	}
	
	public String getString()
	{
		return "This is returned";
	}
	

	public static void main(String[] args) {
		DefaultInterface I1 = new DefaultInterface();
		System.out.println(I1.getString());
		I1.getNumber();

	}

}

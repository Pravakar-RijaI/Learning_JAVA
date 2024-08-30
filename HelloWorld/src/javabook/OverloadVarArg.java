package javabook;

public class OverloadVarArg {
	
	public void vaTest(int ...v)
	{
		System.out.println("Total Items: " + v.length);
		System.out.println("Contents: ");
		
		for(int item : v)
			System.out.print(item + " ");
		System.out.println();
	}
	
	public void vaTest(boolean ...v)
	{
		System.out.println("Total Items: " + v.length);
		System.out.println("Contents: ");
		
		for(boolean item : v)
			System.out.print(item + " ");
	}

	public static void main(String[] args) {
		OverloadVarArg O1 = new OverloadVarArg();
		O1.vaTest(2,4,56,7,4,23,23,43);
		O1.vaTest(true,false,true);
		//O1.vaTest(null);

	}

}

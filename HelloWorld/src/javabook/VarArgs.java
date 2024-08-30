package javabook;

public class VarArgs {
	public void printArray(String name, int ...v)
	{
		System.out.println("Hello! " + name);
		System.out.println(v.length);
		for(int x : v)
			System.out.println(x);
	}

	public static void main(String[] args) {
		VarArgs V1 = new VarArgs();
		V1.printArray("Ramesh",3, 4,8,9,10,11,12);

	}

}

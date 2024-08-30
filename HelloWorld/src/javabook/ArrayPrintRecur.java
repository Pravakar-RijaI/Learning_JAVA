package javabook;

public class ArrayPrintRecur {
	
	public	int[] values;
	
	public ArrayPrintRecur(int size)
	{
		values = new int[size];
	}
	
	public void printArray(int item)
	{
		if(item > this.values.length || item == 0)
			return;
		else
			printArray(item - 1);
		System.out.println("[" + (item - 1) + "]" + values[item - 1]);
	}

	public static void main(String[] args) {
		ArrayPrintRecur A1 = new ArrayPrintRecur(10);
		
		for(int i = 0; i < 10; i++) A1.values[i] = i;
		
		A1.printArray(10);

	}

}

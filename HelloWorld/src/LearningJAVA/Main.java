package LearningJAVA;

public class Main {

		 static int x = 90; 
		 
		 static int global = 23;
	public static void main(String[] args) {
		int x;
		x=23;
		System.out.println(x);
		
		{
			x = 89;
			System.out.println(x);
		}
		System.out.println(x);
		Sum S1 = new Sum(5,9);
		int sum = S1.add();
		System.out.println("Sum: " + sum);
		
	}

}

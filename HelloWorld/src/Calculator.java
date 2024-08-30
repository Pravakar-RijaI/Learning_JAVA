
import java.util.Scanner;

public class Calculator {

	public static void main(String args[])
	{
		System.out.println("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		System.out.println("Enter another Number: ");
		double b = input.nextDouble();
		System.out.println("Enter another Number: ");
		double c = input.nextDouble();
		input.close();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a + " is the greatest number.");
			}
			else
			{
				System.out.println(c + " is the greatest number.");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b + " is the greatest number.");
			}
			else
			{
				System.out.println(c + " is the greatest number.");
			}
		}
		
//		double sum = a + b;
//		System.out.println("Sum of " + a + " and " + b + " is " + sum);
	}
}

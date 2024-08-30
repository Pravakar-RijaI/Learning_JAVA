package LearningJAVA;
import java.util.Scanner;

public class Armstrong {
	public static void main(String args[])
	{
		System.out.println("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		int orgNumber = number;
		int rem;
		int finalDigit = 0;
		
		while(number > 0)
		{
			rem = number % 10;
			number = number / 10;
			finalDigit = finalDigit + (rem*rem*rem);
		}
		if(finalDigit == orgNumber)
		{
			System.out.println(orgNumber + " is Armstrong Number.");
		}
		else
		{
			System.out.println(orgNumber + " is not Armstrong Number.");
		}
	}
}

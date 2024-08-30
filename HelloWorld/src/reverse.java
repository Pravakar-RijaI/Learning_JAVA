import java.util.Scanner;

public class reverse {
	public static void main(String args[]) {
		System.out.println("Enter the Number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		int reversedNumber = 0;
		int rem;
		
		while(number != 0)
		{
			rem = number % 10;
			number = number / 10;
			reversedNumber = (reversedNumber * 10) + rem;
		}
		
		System.out.println("The reversed Number is " + reversedNumber);
	}
	
}

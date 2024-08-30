import java.util.Scanner;

public class digitsfinder {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("Enter the digit to find: ");
		int digit = input.nextInt();
		input.close();
		int rem;
		int count = 0;
		
		while (number != 0)
		{
			rem = number % 10;
			number = number / 10;
			
			if(rem == digit)
			{
				count++;
			}
		}
		
		System.out.println(digit + " was repeated " + count + " times.");

	}

}

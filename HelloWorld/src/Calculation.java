import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		StringBuilder stream = new StringBuilder();
		System.out.println("Enter a Number: ");
		Scanner input1 = new Scanner(System.in);
		double num1 = input1.nextDouble();
		System.out.println("Enter another Number: ");
		double num2 = input1.nextDouble();
		input1.close();
		char choice;
		do
		{
			stream.append("\n\n--------------").append(" WELCOME TO CALCULATOR APP ").append("-------");
			stream.append("\na.Addition\nb.Subtraction\nc.Multiplicaiton\nd.Division");
			stream.append("\nPress x to exit..\n\nChoose option: ");
			System.out.println(stream);
			Scanner input = new Scanner(System.in);
			String option = input.next();
			input.close();
			choice = option.charAt(0);
			
			switch(choice)
			{
			case 'a':
				double sum = num1 + num2;
				System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
				break;
			case 'b':
				double difference = num1 - num2;
				System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
				break;
			case 'c':
				double multi = num1 * num2;
				System.out.println("Product of " + num1 + " and " + num2 + " is " + multi);
				break;
			case 'd':
				double div = num1 / num2;
				System.out.println("Quotient of " + num1 + " and " + num2 + " is " + div);
				break;
			case 'x':
				System.out.println("Program exitted successfully.");
				break;
				
			default:
				System.out.println("Invalid Input");
				break;
				
			}	
		}while(choice != 'x');
		
	}
}

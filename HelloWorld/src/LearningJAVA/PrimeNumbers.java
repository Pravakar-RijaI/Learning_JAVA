package LearningJAVA;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		isPrime(num);
	}
	
	public static void isPrime(int num)
	{
		int flag = 1;
		
		for(int i = 2; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				flag = 0;
				break;
			}
		}
		
		if(flag == 1)
		{
			System.out.println(num + " is Prime.");
		}
		else
		{
			System.out.println(num + " is not Prime.");
		}
	}

}

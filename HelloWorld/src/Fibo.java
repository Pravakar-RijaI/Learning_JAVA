import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		System.out.println("Enter the nth term to find: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int a = 0;
		int b = 1;
		int c;
		
		for(int i = 0; i < n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		
		System.out.println("The " + n + "th term of fibonnaci series: " + a);
		
	}
}

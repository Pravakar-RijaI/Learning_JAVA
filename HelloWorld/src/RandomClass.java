import java.util.Scanner;

public class RandomClass {

	public static void main(String[] args) {
		Person P1 = new Person();
		P1.firstName = "Pravakar";
		P1.lastName = "Rijal";
		P1.age = 23;
		P1.Display();
		
		System.out.println("Enter your age: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Your age is " + input.next());
		input.close();
		int n = 1;
		do
		{
			n++;
			System.out.print("Enter temperature in Celsius(C): ");
			float tempCelsius = input.nextFloat();
			input.close();
			float tempFahrenheit = (tempCelsius * 9/5) + 32;
			System.out.println("The temperature in Fahrenheit: " + tempFahrenheit);			
		}while(n < 5);
	}
	
	

}


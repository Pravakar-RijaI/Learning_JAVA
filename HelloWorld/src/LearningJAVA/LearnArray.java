package LearningJAVA;
import java.util.Scanner;
import java.util.Arrays;

public class LearnArray {
	
	public static void main (String args[])
	{
		String[] names = new String[4];
		names[0]="Manish";
		names[1]="Kunal";
		names[2]="Rahul";
		names[3]="Aakash";
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println(Arrays.toString(names));
		
		int[] numbers = new int[4];
		System.out.print("Enter Numbers: ");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = input.nextInt();
		}
		input.close();
		System.out.println(Arrays.toString(numbers));
	}

}

package LearningJAVA;
import java.util.Scanner;

public class Searchele {
	
	public static void main (String args[])
	{
		int[] numbers = {3,4,6,1,8,0};
		System.out.print("Enter the element to find: ");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		input.close();
		int pos = findnum(numbers,key);
		if(pos != -1)
		{
			System.out.println(key + " found at position " + pos);
		}
		else
		{
			System.out.println(key + " not Found.");
		}
	}
	public static int findnum(int[] numbers, int key)
	{
		if(numbers.length == 0)
		{
			return -1;
		}
		
		for(int i = 0; i < numbers.length; i++)
		{
			if(key == numbers[i])
				return i+1;			
		}
		
		return -1;
	}

}

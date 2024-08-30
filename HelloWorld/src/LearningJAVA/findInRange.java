package LearningJAVA;
import java.util.Scanner;

public class findInRange {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		System.out.println("Enter any five Numbers:");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = input.nextInt();
		}
		System.out.print("Enter lower position to search from: ");
		int start = input.nextInt() - 1;
		System.out.print("Enter higher position to search to: ");
		int end = input.nextInt() - 1;
		System.out.print("Enter the number to find: ");
		int key = input.nextInt();
		input.close();
		
		int pos = findnum(numbers,key,start,end);
		
		if(pos != -1)
		{
			System.out.println(key + " found at postion " + pos);
		}
		else
		{
			System.out.println(key + " not found.");
		}
	}
	
	public static int findnum(int[] numbers, int key, int start, int end)
	{
		if(numbers.length == 0)
			return -1;
		
		while(start <= end)
		{
			if(numbers[start] == key)
				return start + 1;
			start++;
		}
		return -1;
	}

}

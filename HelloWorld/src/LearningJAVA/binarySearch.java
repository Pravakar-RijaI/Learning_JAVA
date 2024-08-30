package LearningJAVA;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		System.out.print("Enter the element to find: ");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		input.close();
		int[] numbers = {3,53,123,235,239,658};
		int pos = binSearch(numbers,key,0,numbers.length - 1);
		
		if(pos != -1)
			System.out.println(key + " found at position " + pos);
		else
			System.out.println( key + " was not found.");
	}
	
	public static int binSearch(int[] numbers, int key, int start, int end)
	{
		if(numbers.length == 0)
			return -1;
	
		while(start <= end)
		{
			int mid = (start + end) / 2;
			
			if(numbers[mid] == key)
				return mid + 1;
			
			else if (numbers[mid] < key)
				start = mid + 1;
			
			else
				end = mid - 1;
		}
		return -1;
	}
}

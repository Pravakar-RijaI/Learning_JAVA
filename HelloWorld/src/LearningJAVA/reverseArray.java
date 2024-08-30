package LearningJAVA;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		
		int[] numbers = {3,5,1,7,8};
		int[] reversedArray = reverse(numbers);
		System.out.println(Arrays.toString(reversedArray));

	}
	
	public static int[] reverse(int[] numbers) {
		int temp;
		int start = 0;
		int end = numbers.length - 1;
		
		while(end > start)
		{
			temp = numbers[end];
			numbers[end] = numbers[start];
			numbers[start] = temp;
			start++;
			end--;
		}
		return numbers;
	}

}

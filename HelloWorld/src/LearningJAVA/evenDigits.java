package LearningJAVA;

import java.util.Arrays;
import java.util.ArrayList;

public class evenDigits {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		ArrayList<Integer> evenDigits = hasEvenDigit(nums);
		System.out.println("Elements with even no. of digits: " + evenDigits);
	}
	
	public static ArrayList<Integer> hasEvenDigit(int[] nums)
	{
		int count;
		int[] temp = Arrays.copyOf(nums,nums.length);
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++)
		{
			count = 0;
			while(temp[i] != 0)
			{
				temp[i] = temp[i] / 10;
				count++;
			}
			
			if(count % 2 == 0) {
				newArray.add(nums[i]);
				
			}
				
		}
		return newArray;
	}

}

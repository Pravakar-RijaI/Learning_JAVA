package leetcode;

import java.util.Arrays;

public class CycleSort {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void cycleSort (int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			
			int temp = arr[i];
			arr[i] = arr[arr[i] - 1];
			arr[arr[i] - 1] = temp;
			
			if(arr[arr.length -1] >arr[arr.length -2])
				break;
		}
	}

}

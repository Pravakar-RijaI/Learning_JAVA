package leetcode;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		int[] arr = {3,2,1,5,9,4};
		selectionSorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSorting (int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int last = arr.length - 1 - i;
			int maxIndex = findMax(arr,0,last);
			swap(arr,maxIndex,last);
		}

	}
	
	public static int findMax(int[] arr,int start,int end)
	{
		int max = start;
		
		for(int i = start; i <= end; i++)
		{
			if(arr[max] < arr[i])
				max = i;
		}
		
		return max;
	}
	
	public static void swap(int[] arr, int source, int desti)
	{
		int temp = arr[source];
		arr[source] = arr[desti];
		arr[desti] = temp;
	}

}

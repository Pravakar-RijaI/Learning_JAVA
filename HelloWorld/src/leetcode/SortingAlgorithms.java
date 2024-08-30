package leetcode;

import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		bubbleSort(arr);
		insertionSort(arr);
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr)
	{
		boolean isSwapped = false;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 1; j < arr.length- i; j++)
			{
				if(arr[j - 1] > arr[j])
				{
					swap(arr,j-1,j);
					isSwapped = true;
				}
			}
			
			if(!isSwapped)
				return;
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i + 1; j > 0; j--)
			{
				if(arr[j - 1] > arr[j])
				{
					swap(arr,j-1,j);
				}
				else
					break;
			}
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i = arr.length; i > 0; i--)
		{
			int last = i - 1;
			int maxIndex = findMax(arr,0,last);
			swap(arr,maxIndex,last);
		}
		
	}
	
	public static int findMax (int[] arr, int start, int end)
	{
		int max = 0;
		
		for(int i = start; i <= end; i++)
		{
			if(arr[i] > arr[max])
				max = i;
		}
		
		return max;
	}
	
	
	public static void swap(int[] arr, int first, int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}

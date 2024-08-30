package leetcode;

import java.util.Arrays;

public class sortedTwoDSearch {
	
	public static void main(String[] args)
	{
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		int target = 1;
		int[] pos = findPos(arr, target);
		System.out.println(Arrays.toString(pos));
	}
	
	public static int[] findPos(int[][] arr, int target)
	{
		int[] ans = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			ans[i] = arr[i][0];
		}
		
		int row = findFloor(ans,target);
		int column = search(arr[row],target,0,arr[row].length - 1); 
		
		return new int[] {row, column};
	}
	
	public static int findFloor(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end)
		{
			int mid = start + (end - start) / 2;
			if(arr[mid] > target)
				end = mid - 1;
			else if(arr[mid] < target)
				start = mid + 1;
			if(arr[mid] == target)
				return mid;
		}
		
		return end;
	}
	
	public static int search(int[] arr, int target, int start, int end)
	{
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
			if(arr[mid] > target)
				end = mid - 1;
			else if(arr[mid] < target)
				start = mid + 1;
			else
				return mid;
				
		}
		
		return -1;
	}

}

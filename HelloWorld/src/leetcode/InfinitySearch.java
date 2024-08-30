package leetcode;

public class InfinitySearch{
	
	public static void main (String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,67,78,89,98};
		int target = 6;
		int pos = infinitySearch(arr, target);
		System.out.println(pos);
	}
	
	public static int infinitySearch(int[] nums, int target)
	{
		int start = 0;
		int end = 1;
		
		while(nums[end] < target)
		{
			int newStart = end + 1;
			end = end + 2*(end - start + 1);
			start = newStart;
		}
		
		return search(nums,target,start,end);
			
	}
	
	public static int search(int[]arr,int target, int start, int end)
	{
		while (start <= end)
		{
			int mid = start + (end - start) / 2;
			if(arr[mid] == target)
				return mid;
			else if (arr[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
}
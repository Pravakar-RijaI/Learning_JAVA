package leetcode;

public class HardMountain {

	public static void main (String[] args)
	{
		int[] mountainArr = {2,3,4,5,6,2,1,0};
		int target = 0;
		int pos = find(mountainArr,target);
		System.out.println(pos);
	}
	
	public static int find(int[] arr, int target)
	{
		int peak = findPeak(arr);
		int ans = search(arr,target,0,peak);
		if(ans == -1)
			ans = search(arr,target,peak + 1, arr.length - 1);
		return ans;
	}
	
	public static int findPeak(int[]arr)
	{
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end)
		{
			int mid = start + (end - start) / 2; 
			if(arr[mid] > arr[mid + 1])
				end = mid;
			else if(arr[mid] < arr[mid + 1])
				start = mid + 1;
		}
		
		return start;
	}
	
	public static int search(int[] arr, int target, int start, int end)
	{
		boolean isAsc = true;
		if(arr[start] > arr[end])
			isAsc = false;
		
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target)
				return mid;
			
			if(isAsc)
			 	{
					if(arr[mid] < target)
						start = mid + 1;	
					else
						end = mid - 1;
			 	}
			else
			{
				if(arr[mid] < target)
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		
		return -1;
	}
}

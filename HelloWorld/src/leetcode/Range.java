package leetcode;

import java.util.Arrays;

public class Range {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 7;
		int[] range = findRange(nums, target);
		System.out.println(Arrays.toString(range));
	}
	
	public static int[] findRange (int[] nums, int target)
	{
		int[] range = {-1,1};
		range[0]= search(nums,target,true);
		if(range[0] != -1)
		range[1] = search(nums,target,false);
		return range;
	}
	
	public static int search (int[] nums, int target, boolean isStartIndex)
	{
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;
		
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
			
			if(nums[mid] == target)
			{
				ans = mid;
				
				if(isStartIndex)
					end = mid - 1;
				
				else
					start = mid + 1;
			}
			
			else if (nums[mid] > target)
				end = mid - 1;
			
			else
				start = mid + 1;
				
		}
		return ans;
	}
	

}

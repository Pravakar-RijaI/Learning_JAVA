package leetcode;

public class SplitArray {
	
	public static void main (String[] args)
	{
		int[] nums= {7,2,5,10,8};
		int m = 2;
		int sum = splitArray(nums,m);
		System.out.println(sum);
	}
	
	public static int splitArray(int[] nums, int m)
	{
		int start = nums[0];
		int end = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] > start)
				start = nums[i];
			
			end += nums[i];
		}
		
		while(start < end)
		{
			int mid = start + (end - start)/ 2;
			
			int count = 1;
			int sum = 0;
			
			for(int num : nums)
			{
				if(sum + num > mid)
				{
					sum = num;
					count++;
				}
				
				else
					sum += num;
			}
			
			if(count > m)
				start = mid + 1;
			else
				end = mid;
		}
		
		return start;
	}
}

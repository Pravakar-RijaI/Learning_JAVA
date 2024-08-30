package leetcode;

public class CeilingProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		int target = 19;
		int ceilValue = searchCeil(arr,target);
		if(ceilValue != -1)
		System.out.println("The Ceil Value of " + target + " is " + ceilValue);
		else
		System.out.println("Can't find Ceil Value of " + target);
		}
	
	public static int searchCeil(int[] arr, int target)
	{
		if(arr.length == 0)
			return -1;
		
		if(target > arr[arr.length - 1])
			return -1;
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			if(arr[mid] == target)
				return arr[mid];
			if(arr[mid] < target)
				start = mid + 1;
			if(arr[mid] > target)
				end = mid - 1;
		}
		return arr[start];
	}

}

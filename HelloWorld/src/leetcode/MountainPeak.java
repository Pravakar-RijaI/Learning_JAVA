package leetcode;

public class MountainPeak {

	public static void main(String[] args) {
		//int[] arr = {0,2,1,0};
		//int[] arr = {1,2,3,4,5,6,4,3,2};
		int[] arr = {5,4,3,2,1};
		int target = findPeak(arr);
		System.out.println(target);
	}
	
	public static int findPeak(int[] arr)
	{
		if(arr.length == 0)
		return -1;
		
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
		
		return arr[start]
				;
	}
	

}

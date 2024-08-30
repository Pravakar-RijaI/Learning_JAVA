package leetcode;

public class RotatedArr {

	public static void main(String[] args) {
		int[] rotatedArr = {5,6,7,8,1,2,4};
		int target = 4;
		int pos = findEle(rotatedArr, target);
		System.out.println(pos);
	}
	
	public static int findEle(int arr[],int target)
	{
		if(arr.length == 0)
			return -1;
		
		int pivot = findPivot(arr);
		

			if(arr[pivot] == target)
				return pivot;
			else if(target < arr[0])
				return search(arr,target,pivot + 1,arr.length - 1);
			else if(target > arr[arr.length -1])
				return search(arr,target,0,pivot - 1);
			else
				return -1;
		}
		
	public static int findPivot(int[] arr)
	{
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
			if(arr[mid] > arr[mid + 1])
				return mid;
			if(arr[mid - 1] > arr[mid])
				return mid - 1;
			if(arr[start] > arr[mid])
				end = mid - 1;
			if(arr[start] <= arr[mid])
				start = mid + 1;
		}
		
		return -1;
		
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

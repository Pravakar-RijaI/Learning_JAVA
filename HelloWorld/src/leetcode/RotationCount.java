package leetcode;

public class RotationCount {

	public static void main(String[] args) {
		//int[] arr = {15,18,1,2,4,12};
		int[] arr = {4,5,6,7,0,1,2};
		int count = findRotationCount(arr);
		System.out.println(count);
	}
	
	public static int findRotationCount(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			if(arr[mid] > arr[mid + 1])
				return mid + 1;
			if(arr[mid - 1] > arr[mid])
				return mid;
			if(arr[start] > arr[mid])
				end = mid - 1;
			if(arr[start] < arr[mid])
				start = mid + 1;
		}
		
		return -1;
	}

}

package leetcode;

public class FloorProg{
	
	public static void main (String[] args) {
		
		int[] numbers = {2,3,5,9,14,16,18};
		int target = 1;
		int floorValue = findFloor(numbers, target);
		if(floorValue != -1)
		System.out.println("The Floor Value of " + target + " is " + floorValue);
		else
		System.out.println("Can't find floor Value of " + target);
		}
	
	public static int findFloor(int[]numbers,  int target)
	{
		if(numbers.length == 0)
			return -1;
		
		if(target < numbers[0])
			return -1;
		
		int start = 0;
		int end = numbers.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
			if(numbers[mid] == target)
				return numbers[mid];
			else if(numbers[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}
		
		return numbers[end];
	}
	}

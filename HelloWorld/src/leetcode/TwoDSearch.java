package leetcode;

public class TwoDSearch {

	public static void main(String[] args) {
		int[][] matrix = {{2,3,4},{4,5,6,7},{7,8}};
		int target = 8;
		String pos = findTarget(matrix, target);
		System.out.println(pos);
	}
	
	public static String findTarget(int[][] arr, int target)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int start = 0;
			int end = arr[i].length - 1;
			
			while(start <= end)
			{
				int mid = start + (end -start) / 2;
				if(arr[i][mid] == target)
					return Integer.toString(i) + Integer.toString(mid);
				else if(arr[i][mid] > target)
					end = mid - 1;
				else
					start = mid + 1;
			}
			
		}
		
		return "Not Found";
	}

}

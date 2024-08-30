import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args)
	{
		int[] arr = {4,5,8,7,3,2};
		//int[] arr = {1,2,3,4,5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr)
	{
		boolean isSwapped = false;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 1; j < arr.length - i; j++)
			{
				if(arr[j] < arr[j - 1])
				{
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					isSwapped = true;
				}
			}
			
			if(!isSwapped)
				return;
		}
	}

}

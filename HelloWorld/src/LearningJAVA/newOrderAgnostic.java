package LearningJAVA;

public class newOrderAgnostic {

	public static void main(String[] args) {
		int[] numbers1 = {1,4,5,6,7,8,23,54,76,87};
		//int[] numbers2 = {98,64,23,12,0,-4,-63};
		int target = 23;
		int pos = binSearch(numbers1,target);
		System.out.println(pos);
	}
	
	public static int binSearch(int[] numbers, int key)
	{
		int start = 0;
		int end = numbers.length - 1;
		int temp;
		
		if(numbers[start] > numbers[end])
		{
			temp = start;
			start = end;
			end = temp;
		}
		
		for(int i = 0; i < numbers.length; i++)
		{
			int mid = start + (end - start) / 2;
			
			if (numbers[mid] == key)
				return mid + 1;
			else if(numbers[mid] > key)
				end = mid - 1;
			else
				start = mid + 1;
		}
			
		return -1;
	}

}

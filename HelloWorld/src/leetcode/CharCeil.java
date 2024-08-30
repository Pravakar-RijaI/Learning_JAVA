package leetcode;

public class CharCeil {

	public static void main(String[] args) {
		char[] letters = {'c','d','e'};
		char target = 'e';
		char charValue = findCharCeil(letters, target);
		System.out.println("The Ceil Char Value is " + charValue);
	}
	
	public static char findCharCeil(char[] letters, char target)
	{
		int start = 0;
		int end = letters.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
	
			if(letters[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return letters[start % letters.length];
	}

}

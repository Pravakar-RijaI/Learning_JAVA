package LearningJAVA;
import java.util.Scanner;

public class SearchInStrings {
	
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		String word = "Spiderman";
		System.out.println("Enter a letter to find: ");
		char letter = input.next().charAt(0);
		input.close();
		int pos = findletter(word.toLowerCase(),letter);
		if(pos != -1)
			System.out.println(letter + " found at position " + pos);
		else
			System.out.println(letter + " was not found.");
	}
	
	public static int findletter(String word, char letter)
	{
		if(word.length() == 0)
			return -1;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == letter)
				return i+1;
		}
		return -1;
	}

}

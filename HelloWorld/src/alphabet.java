import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		System.out.print("Enter a Character: ");
		Scanner input1 = new Scanner(System.in);
		String word = input1.next();
		char letter = word.charAt(0);
		if((int) letter >= 65 && (int) letter <= 96)
		System.out.println(letter + " is UPPERCASE.");
		else
			System.out.println(letter + " is lowercase");
		input1.close();
		
	}

}

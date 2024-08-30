package classPrograms;

public class Palindrome {
	private int number;
	
	public Palindrome(int number)
	{
		this.number = number;
	}
	
	public void isPalindrome() {
		int temp = this.number;
		int reverse = 0;
		
		while(temp > 0)
		{
			reverse = (reverse * 10) + (temp % 10);
			temp /= 10;
		}
		
		if(this.number == reverse)
			System.out.println(this.number + " is Palindrome.");
		else
			System.out.println(this.number + " is not Palindrome.");
	}


}

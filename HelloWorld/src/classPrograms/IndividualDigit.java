package classPrograms;

public class IndividualDigit {
	private int num;
	private int digit;
	
	public IndividualDigit(int num)
	{
		this.num= num;	
	}
	
	public void printDigits() {
		while(num > 0)
		{
			digit = num % 10;
			num = num / 10;
			System.out.print(digit + ",");
		}
	}

}

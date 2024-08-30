package classPrograms;

public class Armstrong {
private int number;

public Armstrong(int number)
{
	this.number = number;
}

public void checkArmstrong()
{
	int temp = this.number;
	int digit;
	int result = 0;
	
	while(temp > 0)
	{
		digit = temp % 10;
		temp /= 10;
		result += digit*digit*digit;
	}
	
	if(result == this.number)
		System.out.println(this.number + " is a Armstrong Number.");
	else
		System.out.println(this.number + " is not a Armstrong Number.");
}
}

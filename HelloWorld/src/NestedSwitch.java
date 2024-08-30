import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		System.out.print("Enter the province no and district:	");
		Scanner input = new Scanner(System.in);
		int province = input.nextInt();
		String district = input.next();
		input.close();
		switch(province)
		{
		case 1:
			System.out.println("Koshi Province");
			switch(district)
			{
			case "jhapa":
				System.out.println("You are jhapali..");
				break;
			case "morang":
				System.out.println("You are neighbour of jhapali");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			break;
		case 2:
			System.out.println("Madhesh Pradesh");
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
			default:
				System.out.println("Invalid Input");
				break;
		}
		

	}

}

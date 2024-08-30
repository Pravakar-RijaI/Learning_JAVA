import java.util.Arrays;

public class StackDemo {

	public static void main(String[] args) 
	{
			Stack stack = new Stack(10);
			stack.push(4);
			stack.push(5);
			stack.push(11);
			stack.push(12);
			stack.push(45);
			stack.push(23);
			System.out.println(stack.pop());
			System.out.println(Arrays.toString(stack.popNElements(2)));
			System.out.println(Arrays.toString(stack.skipAndPopElements(2, 3)));

	}

}

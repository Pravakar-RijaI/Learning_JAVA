package javabook;

public class StackClass {
	//private int[] stack = new int[10];
	private int[] stack;
	private int tos;
	
	public StackClass(int size) {
		this.stack = new int[size];
		this.tos = -1;
	}
	
	public void push(int item) {
		if(tos == stack.length - 1)
		{
			System.out.println("Stack Overflow");
			return;
		}
		else
		{	
			stack[++tos] = item;
		}
	}
	
	public int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		
		int item = stack[tos--];
			
		return item;
	}

	public static void main(String[] args) {
		StackClass stack = new StackClass(10);
		stack.push(10);
		stack.push(8);
		stack.push(7);
		stack.push(6);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}

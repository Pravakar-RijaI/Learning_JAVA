interface IStack
{
	void push(int item);
	int pop();

	default int[] popNElements(int n)
	{
		return getElements(n);
	}

	default int[] skipAndPopElements(int skip, int n)
	{
		getElements(skip);

		return getElements(n);
	}

	private int[] getElements(int n)
	{
		int[] elements = new int[n];

		for(int i = 0; i < n; i++)
			elements[i] = pop();

		return elements;
	}
}

class Stack implements IStack
{
	private int[] stack;
	private int tos = -1;
	private int size;

	public Stack(int size)
	{
		this.size = size;
		this.stack = new int[size];
	}

	public void push(int item)
	{
		if(tos == this.stack.length - 1)
			System.out.println("Stack Overflow");
		else
			stack[++tos] = item;
	}

	public int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
			return stack[tos--];
	}
}
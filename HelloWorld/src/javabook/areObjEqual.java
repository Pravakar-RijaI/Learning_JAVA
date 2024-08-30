package javabook;

public class areObjEqual {
	private int a;
	private int b;
	
	public areObjEqual(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public boolean isEqual(areObjEqual obj)
	{
		return (this.a == obj.a && this.b == obj.b);
	}

}

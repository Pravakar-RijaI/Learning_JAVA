package javabook;

public class ObjectParam {
	private int x;
	private int y;
	
	public ObjectParam(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public ObjectParam(ObjectParam obj)
	{
		this.x = obj.x;
		this.y = obj.y;
	}
	
	public void introduce()
	{
		System.out.println("x: " + this.x);
		System.out.println("y: " + this.y);
	}

}

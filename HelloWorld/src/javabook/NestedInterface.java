package javabook;

 class NestedInterface {
	
	public interface NestedIf
	{
		boolean isNotNegative(int x);
	}
}

 class ImplementInterface implements NestedInterface.NestedIf
{
	public boolean isNotNegative(int x)
	{
		if(x < 0)
			return false;
		
		return true;
	}

	public static void main(String[] args) {
		NestedInterface.NestedIf N1 = new ImplementInterface();
		System.out.println(N1.isNotNegative(-5));
	}

}

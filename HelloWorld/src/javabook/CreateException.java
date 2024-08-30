package javabook;

class CreateException extends Exception {
	
	private int detail;
	
	public CreateException(int detail)
	{
		this.detail = detail;
	}
	
	public String toString() 
	{
		return "Exception: " + this.detail;
	}
}

	 class ClassA
	 {
		 public static void sendExp() throws CreateException
		 {
			 throw new CreateException(10);
		 }

	public static void main(String[] args) throws CreateException
	{
		sendExp();
//		try
//		{
//			sendExp();
//		}
//		catch(CreateException e)
//		{
//			System.out.println("Error: " + e);
//		}

	}

}

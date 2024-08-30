package classPrograms;

interface Father
{
	void isStrong();
}

interface Mother
{
	void isBeautiful();
}

class Child implements Father, Mother
{
	public void isStrong()
	{
		System.out.println("Iam strong");
	}
	
	public void isBeautiful()
	{
		System.out.println("Iam beautiful");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Child C1 = new Child();
		C1.isStrong();
		C1.isBeautiful();
	}

}

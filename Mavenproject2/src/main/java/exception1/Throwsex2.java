package exception1;

public class Throwsex2 
{
public static void add(int a,int b)
{
	int c=a+b;
	if(c<10)
	{
		throw new ArithmeticException ("Less Than 10");
	}
	else
	{
		System.out.println("Not less than 10");
	}
}
	public static void main(String[] args)
	{
		try
		{
			Throwsex2.add(5, 3);
			System.out.println("Remaining");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Hello catch");
		}
		System.out.println("Hello Throw");
	}

}

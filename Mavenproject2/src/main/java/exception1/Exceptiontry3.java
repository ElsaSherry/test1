package exception1;

public class Exceptiontry3
{
static int a=10;
static int b=0;
	public static void main(String[] args)
	{
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			int d=11;
			int e=12;
			int f=d+e;
			System.out.println(f);
			System.out.println("Catch worked");
		}
		finally 
		{
			System.out.println("The rest of code executed");
		}
		System.out.println("Hello Exception");

	}

}

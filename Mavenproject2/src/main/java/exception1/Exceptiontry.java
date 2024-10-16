package exception1;

public class Exceptiontry
{
	static int a=0;
	static int b=20;
	static int c;
	
	public static void main(String[] args) 
	{
		try
		{
			c=b/a;
			System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("hello");

	}

}

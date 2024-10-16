package exception1;

public class Exceptiontry2
{
static int a=0;
static int b=40;
static int c;

	public static void main(String[] args) 
	{
		try
		{
			//c=b/a;
			//System.out.println(c);
			String s=null;
			System.out.println(s.length());
			int d[]=new int[5];
			 d[10]=50;
			
		}
		catch(NullPointerException np)
		{
		System.out.println(np);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
			
		}
		catch(Exception ed)
		{
			System.out.println(ed);
		}
		System.out.println("Hello ");
	}

}

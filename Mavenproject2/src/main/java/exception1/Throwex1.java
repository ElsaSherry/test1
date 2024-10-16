package exception1;

public class Throwex1 
{
public static void vote(int a)
{
	if(a<18)
	{
		throw new ArithmeticException("Not Eligible to vote");
	
	}
	else
	{
		System.out.println("Eligible to vote");
	}
}
	public static void main(String[] args) 
	{
	Throwex1.vote(19);

	}

}

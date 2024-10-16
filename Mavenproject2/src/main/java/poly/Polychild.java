package poly;

public class Polychild extends Polyparent
{
	public void add(int a,int b)
	{
		super.add(a, b);
		int d=a+b;
		if(d%10==0)
		{
			System.out.println("The result is divisible");
		}
		else
		{
		System.out.println("Not divisible by 10");	
		}
	}

	public static void main(String[] args)
	{
		Polychild obj=new Polychild();
		obj.add(20, 30);
		obj.add(45, 32);

	}

}

package interface1;

public class Interex implements Interfaceex1,Interfaceex2
{

	public static void main(String[] args)
	{
		Interex obj=new Interex();
		obj.add();
		obj.sub();
		obj.display();
		obj.mult();
		Interfaceex1 obj2=new Interex();
		obj2.add();
		obj2.sub();
		Interfaceex2 obj3=new Interex();
		obj3.display();
		obj3.mult();
		
	}

	@Override
	public void add() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void sub()
	{
		int a=22;
		int b=33;
		int c=a-b;
		System.out.println(c);
		
	}

	@Override
	public void display() 
	{
		
	System.out.println("hello Interface");	
	}

	@Override
	public void mult() 
	{
		int a=66;
		int b=77;
		int c=a*b;
		
		System.out.println(c);
	}

}

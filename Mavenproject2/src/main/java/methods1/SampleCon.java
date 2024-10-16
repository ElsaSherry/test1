package methods1;

public class SampleCon 
{
	int a=10;
public SampleCon()
{
	System.out.println("hello constructer");
}
public  void display()
{
	System.out.println("Hello Instance Method");
}
public int add(int a, int b)
{
	int c=a+b;
	return c;
}
public static int sub(int a,int b)
{
	int c=a-b;
	return c;
}
public static void display1()
{
System.out.println("Hello Static Method");	
}
	public static void main(String[] args) 
	{
	
SampleCon obj=new SampleCon ();
obj.display();
System.out.println(obj.a);
System.out.println(obj.add(22, 033));
System.out.println(SampleCon.sub(34, 023));
display1();

	}

}

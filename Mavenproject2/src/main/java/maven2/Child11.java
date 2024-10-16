package maven2;

public class Child11 extends Parent11
{
	int c;
	public void sub()
	{
		c=b-a;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Child11 obj=new Child11();
		obj.add();
		obj.sub();
		
	}

}

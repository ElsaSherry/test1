package superm;

public class Superchild extends Superpar
{
public Superchild()
{
	super();
}
public void display()
{
	super.sub();
	System.out.println(super.a);
}
	public static void main(String[] args)
	{
		Superchild obj=new Superchild();
		obj.display();
		obj.sub();

	}

}

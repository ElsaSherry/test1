
package maven2;

public class Child12 extends Parent11
{
int c;
public void mult()
{
	c=a*b;
	System.out.println(c);
}
	public static void main(String[] args) 
	{
	Child12 obj=new Child12();
	obj.add();
	obj.mult();

	}

}

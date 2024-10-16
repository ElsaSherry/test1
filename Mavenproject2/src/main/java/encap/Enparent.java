package encap;

public class Enparent
{
private int a=10;
private int b=20;
int c;
public void setter(int a, int b)
{
	this.a=a;
	this.b=b;
	c=a+b;
	System.out.println(c);
}
public void getter(int c)
{
	this.c=c;
	System.out.println(c);
}
}

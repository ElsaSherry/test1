package exception1;

import java.io.IOException;

public class Throwseg1 
{
public void display()throws IOException
{
	throw new IOException("Exception detected");
}
public void show()throws IOException
{
	display();
}
public void watch()
{
	try
	{
		show();
		}
	catch(IOException e)
	{
		System.out.println("hello exception");
	}
}
	public static void main(String[] args) throws IOException
	{
		Throwseg1 obj=new Throwseg1();
		obj.watch();
		System.out.println("hello");

	}

}

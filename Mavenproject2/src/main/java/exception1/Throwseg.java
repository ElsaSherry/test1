package exception1;

import java.io.IOException;

public class Throwseg
{
public void display()throws IOException
{
	throw new IOException("Exception Detected");
}
	public static void main(String[] args)throws IOException
	{
	Throwseg obj=new Throwseg();
	obj.display();
	System.out.println("Hello");

	}

}

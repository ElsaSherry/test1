package aggregation1;

public class Aggregation12 
{
String place;
int a;
Aggregation11 ag;
public Aggregation12(String place,int a,Aggregation11 ag)
{
	
	this.place=place;
	this.a=a;
	this.ag=ag;
}
public void display()
{
	System.out.println(place);
	System.out.println(a);
	System.out.println(ag.id);
}
	public static void main(String[] args)
	{
		
Aggregation11 obj1=new Aggregation11("elsa",22);
Aggregation12 obj2=new Aggregation12("TVM",11, obj1);
obj2.display();
	}

}

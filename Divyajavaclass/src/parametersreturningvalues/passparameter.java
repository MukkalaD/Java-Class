package parametersreturningvalues;

public class passparameter {

	public static void main(String[] args) 
	{
		passparameter obj1=new passparameter();
		
		obj1.add(3, 4);
		obj1.sub(58.2, 30.2);

	}
	
	public void add(int a, int b)
	{
int c=a+b;
System.out.println(c);
		
	}
public void sub(double x, double y)

{
 double z=x-y;
 System.out.println(z);
}
}

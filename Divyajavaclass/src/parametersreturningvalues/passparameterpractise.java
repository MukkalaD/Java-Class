package parametersreturningvalues;

public class passparameterpractise {

	public static void main(String[] args)
	// in this class first you have to create the the non static method, and after that you have to create object for the non static method.
	
	{
		passparameterpractise obj2=new passparameterpractise();
		
		obj2.add(50, 40);
		obj2.sub(70, 40);
		

	}
	
public void add(int a, int b)
{
	int s=a+b;
	System.out.println(s);
	
	
}
public void sub (int c, int d)
{
	int x=d-c;
	System.out.println(x);
	
}
}

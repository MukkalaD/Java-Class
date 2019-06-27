package parametersreturningvalues;

public class returnvalue {

	public static void main(String[] args) 
	{
		returnvalue obj1=new returnvalue();
		int c=obj1.add(20, 30);
		System.out.println(c);
		double z=obj1.sub(30, 40);
		System.out.println(z);
		
		
	}
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public double sub(double x,double y)
	{
		double z=x-y;
		return z;
	}
	

}

package polymorphism;

public class polymorphismdemo {

	public static void main(String[] args) {
		// poly=many times, you can write one form in many forms.it is divided into 2 types
		//1-early binding, 2.late binding//
		
		//compile time or method overloading//
		
		polymorphismdemo obj1=new polymorphismdemo();
		
		obj1.add(34,45);
		obj1.add(45, 67, 78);
		obj1.sub(67.2, 75.34);
		obj1.add(67.2, 4);
		obj1.add(2, 10.2);
				
		
		
	}
	//we can add so many number of arguments//
	//for example public void int is number of argument//
	//and we can add different types of argument, like first i added int, and in second method i added double//
		public void add(int a,int b)
		
		{
			int c=a+b;
			System.out.println(c);
		}
		
	      public void sub(double a, double b)
	      {
	    	  double c=a+b;
	    	  System.out.println(c);
	      }
		public void add(int a, int b, int d)

		{
			int c=a+b+d;
			System.out.println(c);
		}
		//now we can add 2 different arguments in one order, like for example double and int. but we will get highest value as double.because double is highest than int.
		
		public void add(int a,double b)
		{
			double c=a+b;
			System.out.println(c);
		}
		public void add(double a, int b)
		{
			double c=a+b;
			System.out.println(c);
		}
		}




package Inheritance;

public class Childclass extends baseclass {

	public static void main(String[] args) {

// if you write extends as a statement, you can execute here//
	//and here u are creating object for childclass and extending baseclass, so u will get baseclass and childclass methods//
//now inthis class when you create baseclass object, you will get only baseclass methods, because u extended baseclass, not childclass//
		Childclass obj1=new Childclass();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		

	}
	
	public void div()
	
	{
		System.out.println("my division is 140");
	}
public void mul()
{
	System.out.println("My multiplication is 170");
	
}
}

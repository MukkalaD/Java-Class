package Interface;

public class advancedcalci implements Calci {

	public static void main(String[] args) {
	
		advancedcalci obj1=new advancedcalci();
		
		obj1.add();
		obj1.sub();
// in this interface take advanced calci as parent class, and calci as baby class
		//you can create object for for parent class, and baby class with parent class, 
	//but you cannot create obj class for baby class with parent class, and only baby class obj- because there is no methods in baby class, you can see only declaration//
	//In interface if you varabile in baby class, for example int x=10, if you want to give another varaible in parent you have to give in this way like x1 or x2...., because it should not be same//
		
		}
	

	public void add() {
		System.out.println("print the value addition");
		
	}

	public void sub() {
		System.out.println("print the value substraction");
		
	}

}

package string;

public class stringdemo {

	public static void main(String[] args) {
		
		String name="divya reddy";
		
		boolean status1=name.startsWith("divya");
		
		System.out.println(status1);
		
		boolean status2=name.endsWith("rowdy");
		
		System.out.println(status2);
		
		String design="narendra dev";
		
		boolean city1=design.startsWith("dev");
		
		System.out.println(city1);
		
		boolean city2=design.endsWith("narendra");
		
		System.out.println(city2);	
		
		//stringdemoclass2//- in this class it compares actual and expected results
		
		String actuals="Welcome to india";
		String expected="Welcome to india";
		boolean country=actuals.equals(expected);
		
		System.out.println(country);
//when you write the statement with lower case and upper case, it gives false result. on that time instead of equal-write equalsignorecase.
		
		String food="Biryani is yummy";
		String food1="biryani is yummy";
		
		boolean taste=food.equalsIgnoreCase(food1);
		
		System.out.println(taste);
		
		String girls="Vanshika is good girl";
		String boys="Ruhitha is noty girl";
		
		boolean gender=girls.equals(boys);
		
		System.out.println(gender);
		
		//stringdemo class 3-actual contains expected. if the actual statement contains same in expected statement, then it is true//
		
		String anthem="Web services testing";
		String anthem1="testing";
		boolean company=anthem.contains(anthem1);
		
		System.out.println(company);
		
		String cigna="healthcare domain";
		String cigna1="banking";
		
		boolean company2=cigna.contains(cigna1);
		System.out.println(company2);
		// stringdemo class 4
		//in this class we are going to see trim-trim means it eliminates the space before and after the names, letters...//
		
		String medicine="    dolo     vicks   ";
		String medicine1=medicine.trim();
		
		System.out.println(medicine1);
		
		String numbers="     30      20";
		String numbers2=numbers.trim();
		
		System.out.println(numbers2);
		
		//stringdemo5-charAt()-in this class for example i typed the letter as divya, and gave charAt(2), then it is going to print letter v, because it count the letter in the statement like d=0,i=1,v=2,y=3,a=4
		
		String wood="chair table";
		
		
		System.out.println(wood.charAt(4));
		
		String sweets="laddu samo";
		
		System.out.println(sweets.charAt(8));
		
		
	}

}

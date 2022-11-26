package week03;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Bob";
		String lastName = "Ross";
		
		//invoke the method
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName); //passing in a string rather than using a variable from above.
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
	}
	public static String createFullName(String x, String y) { //method signature
		//in this ex, String is the return type of this method
		//not all methods have to return something. 
		//if method doesn't return something, you have to replace datatype with void
		//what is in the parenthesis is a parameter 
		return x + " " + y;
		
	}

}

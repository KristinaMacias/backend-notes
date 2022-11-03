package week01;

public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a variable to hold the quantity of available plane seats left on a flight
		int seatsAvail = 32;
	
		
		//create a variable to hold the cost of groceries at checkout
		double groceryCost = 103.20;
		
		//create a variable to hold a persons middle initial
		char middleInitial = 'A';
		
		//create a variable to hold true if it is hot outside
		boolean isHotOutside = true;
		
		//create a variable to hold a persons first name
		String firstName = "Kristina";//not bold because not primitive?
		
		//create a variable to hold a street address
		String streetAddress = "10341 Pixie Ave";

		//print all variables to the console
		
		System.out.println(seatsAvail);
		System.out.println(groceryCost);
		System.out.println(middleInitial); //has to be single quote
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);

		//a customer booked 2 plane seats. Remove 2 seats
		seatsAvail -= 2; 
		System.out.println("available seats on plane: " + seatsAvail);
		
		//impulse candy bar purchase. add 2.15 to the grocery total
		groceryCost += 2.15;
		System.out.println("price for groceries: " + groceryCost);//why does it add so many decimal points?
		
		//birth certificate was printed incorrectly. Change the middle initial
		middleInitial = 'C';
		System.out.println("middle initial: " + middleInitial);
		
		//the season has changed. update the hot outside variable to the opposite
		isHotOutside = false;
		System.out.println("is hot outside? " + isHotOutside);
		
		//create a new variable called full name using the customers first name, middle initial and last name of your choice
		middleInitial = 'A';
		String fullName = firstName + " " + middleInitial + " " + "Macias";
		System.out.println(fullName);
		
		//print to console a line that introduces person
		System.out.println("Hello, " + fullName);

	}

}

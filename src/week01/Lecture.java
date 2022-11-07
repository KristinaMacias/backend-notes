package week01;

public class Lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Kristina";
		
		System.out.println(firstName);
		
		String lastName = "Macias";

		
		System.out.println(lastName);
		
		String fullName = firstName + ' ' + lastName;
		
		System.out.println(fullName);
		
		String city = "Long Beach";
		String state = "California";
		
		System.out.println("\nMs. " + fullName + " lives in " + city + ", " + state);
		
		int firstNumber = 10;
		int secondNumber = 12;
		
		
		//boolean operators
		System.out.println(firstNumber == secondNumber);
		System.out.println(city == state);
		
		//conditional statements (if else if)
		if (firstName == "Kristina" && lastName == "Macias") {
			System.out.println("Hello, " + fullName);
		} else {
			System.out.println("What is your full name?");
		}
		
		int age = 15;
		
		if(age >= 16) {
			System.out.println("You are " + age + " years old. You can get your license.");
		} else {
			System.out.println("Please wait " + (16 - age) + " year(s) to get your license.");
		}
		
		
		//with else if examples
		int temperature = 80;
		
		if (temperature <= 40) {
			System.out.println("The temperature is " + temperature + ", so I will wear a heavy coat.");
		} else if (temperature >= 60 && temperature <= 79) {
			System.out.println("The temperature is " + temperature + ", so I will wear a light sweater.");
		} else {
			System.out.println("The temperature is " + temperature + ", so I will wear shorts and a tshirt.");
		}
		
		//conditional statements - switch
		char grade = 'a';
		
		switch (grade) {
			case 'A':
				System.out.println("Scored at least 90%");
			case 'a':
				System.out.println("Scored at least 90%");
				break;
			case 'B':
				System.out.println("Scored at least 80%");
				break;
			case 'C':
				System.out.println("Scored at least 70%");
				break;
			case 'D':
				System.out.println("Scored at least 60%");
				break;
			case 'F':
				System.out.println("Did not meet requirements");
				
		
		}
		
		//loops 
		
		int

	}

}

package week02;

public class Videos {

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
		
		//boolean expression
		System.out.println(2 == 2);//true
		System.out.println(5 < 10);//true
		System.out.println(2 > 3);//false
		System.out.println(true == true);//true
		System.out.println(true == false);//false
		System.out.println(true || false);//true
		System.out.println(true && false);//false
		
		//loops
	
		//for loop
		for(int i = 1; i <= 10; i++) {
			//System.out.println(i);
			System.out.println("scoop " + i + " cups of flower.");
		}
		
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		
		//while loop - use when i have less knowledge of how many iterations are needed
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}

		int x = 20;
		while(x > 0) {
			System.out.println(x);
			x--;
		}
		
		//do while loop - prints at least once
		int y = 11; //will print 11 and exit loop because do while guarantees at least one loop
		do {
			System.out.println(y);
			y++;
		} while(y < 50);
		
		int index = 60;
		do {
			System.out.println(index);
			index--;
		} while (index > 0);
	}
}

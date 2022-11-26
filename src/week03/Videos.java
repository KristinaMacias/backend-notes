package week03;

public class Videos {
	
	public static void main (String[] args) {
		

		//arrays 
		String[] students = new String[3];
		students[0] = "Kristina";
		students[1] = "Victoria";
		students[2] = "Nick";
			
		
		//regular for loop
 		for(int i = 0; i < students.length; i++) {
 			System.out.println(students[i]);
 		}
 		
 		//enhanced for loop
 		 for(String student : students) {
 			 //for each student in students array
 			 System.out.println(student);
 		 }
 		 
 		 
 		 //array with integers
 		 int[] numbers = new int[4];
 		 numbers[0] = 100;
 		 numbers[1] = 200;
 		 numbers[2] = 300;
 		 numbers[3] = 400;
 		 
 		 
 		 int sum = 0;
 		 
 		 for(int number : numbers) {
 			 sum += number;
 		 }
 		 
 		 System.out.println(sum);
 		 System.out.println(sum / numbers.length);
 		 
 		 //multiples of 3 
 		 int[] multiplesOfThree = new int[10];
 		 
 		 for(int i = 1; i <= multiplesOfThree.length; i++) {
 			 //create a new element in the array 
 			 multiplesOfThree[i - 1] = i * 3;
 			 System.out.println("printing multiples of three: " + multiplesOfThree[i - 1]);
 			 
 		 }
 		 
 		 int[] multiplesOfFives = new int[10];
 		 
 		 for(int i = 0; i < multiplesOfFives.length; i++) {
 			 multiplesOfFives[i] = (i + 1)  * 5;
 			 //ensures first value is 1 
 			 System.out.println("multiples of fives: " + multiplesOfFives[i]);
 		 }
 		 
 		 //methods
	}

}

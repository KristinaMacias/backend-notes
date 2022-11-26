package week03;

public class MoreMethods {

	public static void main(String[] args) {
		int[] myArray = new int[4]; //this array wont work on average. why? 
		myArray[0] = 100;
		myArray[1] = 200;
		myArray[2] = 400;
		myArray[3] = 300;
		
		System.out.println(sumArray(myArray));
		System.out.println(averageArray(myArray));
		
		
	}
	public static int sumArray(int[] numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
	public static double averageArray(int[]  numbers) {
		double sum = 0;
		for (int number : numbers) {
			sum+= number;
		}
		
		return sum / numbers.length;
	}

}

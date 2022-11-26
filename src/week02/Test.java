package week02;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String day = "Saturday";
//		String month = "January";
//		
//		
//		if(day == "Saturday" || day == "Sunday" || month == "July" || month == "August" || month == "June") {
//			System.out.println("I do not have school today!");
//		} else {
//			System.out.println("I do have school today");
//		}
		
		
//		int countDown = 10;
//		
//		if(countDown < 3) {
//			System.out.println("We have lift off!");
//		} else if(countDown >= 3 && countDown <= 10) {
//			 for(int i = 10; i > 0; i--) {
//				 System.out.println(i + "...");
//			 }
//			 System.out.println("We have lift off!");
//		 } 
//		
//		int total;
//		int num = 222;
//		
//		for(int i = 0; i <= 10; i++) {
//            total = i * num;
//            System.out.println(i +  " x " + num + " = " + total);
//            
//        }
//		
//		Do While Loop Practice: 
//		Create a do while loop that checks the length of userWord
//		if that word is less than 5 characters, then print userWord to the console 1 time. 
//		If it is 5 or more characters print userWord to the console userWord.length() number of times.
//
//		Example: if userWord is "Loops", then "Loops" would print 5 times. If it is "Java", then "Java" would only print 1 time
		
		String userWord = "olive";
		System.out.println(userWord.length());
		int wordLength = userWord.length();
		int counter = wordLength;

		
		if(wordLength >= 5) { //if wordLength is greater than or equal to 5
			do {
				System.out.println(userWord); //print userWord
				counter--; //increment count
			} while(counter > 0); //1 is less than userWord.length
		} System.out.println(userWord);
		
		
		//instructor solution
		System.out.println("instructor solution");

		
		do {
		    System.out.println(userWord);//print word
		    if ( wordLength < 5 ) { //if wordLength is less than 5
		        break; //stop printing
		    } 
		    counter--;//decrement counter
		} while ( counter > 0 );// while 7 > 0
		
		System.out.println(2);
		
		
 		 
 		
	}

}

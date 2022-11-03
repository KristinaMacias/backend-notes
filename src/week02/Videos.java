package week02;

public class Videos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

package week03;

public class objects {

	public static void main(String[] args) {
		
		//Strings(has methods?) and Arrays(has properties?) are objects that have properties and methods
		
		String instrument1 = "MPC One";
		System.out.println(instrument1);
		
		System.out.println(instrument1.length());
		
		String[] instruments = new String[4];
		System.out.println(instruments.length);//still recognizes the length is four even though I have not defined what's inside the array
		 
		//string literal vs string object?
		String strObject = new String("Java");//this is creating string object and not recommended
		String strLiteral = "Java";
		
		//check == this checks for same in memory
		System.out.println("comparing objects in memory: " + strObject == strLiteral);//false because they are not the same in memory
		System.out.println("comparing if the values of the object are the same: " + strObject.equals(strLiteral));//true because the values of the object are the same
		

		//Both expressions give you a String object, but there is a subtle difference between them. When you create a String object using the new() operator, it always creates a new object in heap memory.

		//Read more: https://www.java67.com/2014/08/difference-between-string-literal-and-new-String-object-Java.html#ixzz7lmUO9q00
		
		
		
	}

}

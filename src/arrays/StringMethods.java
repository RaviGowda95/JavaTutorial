package arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s = "Welcome";
		System.out.println(s.length());  //number of characters in the string - 7
		
		//concatenation 
		String s1 = "Welcome to ";
		String s2 = "Java Tutorial";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println("Welcome to " + "Java Tutorial");
		
		//Equals
		String s3 = "WELCOME";
		String s4 = "welcome";
		System.out.println(s3.equals(s4));              //false
		System.out.println(s3.equalsIgnoreCase(s4));    //true
		
		//contains
		s3.contains("COM");
		System.out.println(s3.contains("COM"));    //true
		System.out.println(s3.contains("ABC"));    //false
		
		//Substring
		System.out.println(s3.substring(0,3));  //WEL
		System.out.println(s3.substring(2,5));  //LCO
		System.out.println(s3.substring(4,7));  //OME
		
		//Replace
		System.out.println(s.replace('e', 'a'));
		System.out.println(s.replace("come", "kome"));
		
		
		
	}

}

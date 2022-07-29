package practiceprograms;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium";
		String reverse = "";
		char c ;
		
		for (int i = 0; i <s.length() ; i++)
		{
			c = s.charAt(i); //extracts each character
			reverse = c + reverse; //adds each character in front of the existing string. note** c comes first in addition and reverse (reverse = c + reverse)<--concat
		}
		
		System.out.println("Reverse of the string is : " + reverse);
		
	}

}

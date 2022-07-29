package practiceprograms;

public class PalindromeNumber {
	
	
	static int palindrome(int n)
	{
		int remainder;
		int reverse = 0;
		while (n>0)
		{
			remainder = n%10;
			reverse = (reverse*10) + remainder;
			n= n/10;
			
		}
		
		return reverse;
		
	}
	
	
	public static void main(String[] args) {

		int n = 56789;
		System.out.println("Reverse of the number is : " + palindrome(n));
		
	}

}

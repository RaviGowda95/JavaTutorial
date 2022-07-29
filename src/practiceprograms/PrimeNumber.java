package practiceprograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 7;
		boolean flag = false;
		for(int i = 2; i<=number/2; i++)
		{
			if(number%i==0)
			{	
				flag = true;
				break;
			}
				
		}
		if (flag) {     //<--flag is true
			System.out.println(number + " is not a prime number");
		} 
		else
		{
			System.out.println(number + " is prime number");
		}
		
		
		
	}


}

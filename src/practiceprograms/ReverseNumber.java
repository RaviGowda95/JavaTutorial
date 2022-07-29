package practiceprograms;

public class ReverseNumber {

	//1.store remainder of the number in one variable
	//2.intialize reverse no variable to 0 and multiply the variable reverse by 10 and add the remainder value into it.
	//3.divide the number by 10

	// Function to reverse the number
	static int ReverseNum(int n){

		int reverse = 0; // reversed number
		int remainder;   // remainder

		while(n>0){

			remainder = n%10;
			reverse = (reverse*10) + remainder;
			n = n/10;
		}

		return reverse;
	}

	public static void main(String[] args) {

		int n = 4526;
		System.out.print("Reversed Number is "+ ReverseNum(n));


	}

}

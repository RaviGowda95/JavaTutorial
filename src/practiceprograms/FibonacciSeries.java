package practiceprograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		//Fibonacci series is the series of elements where, the previous two elements are added to get the next element,starting with 0 and 1
		
		int n1 = 0, n2 = 1,n3,count =10;
		System.out.print(n1 + " "+ n2);//printing 0 and 1 
		
		for(int i =2; i<count; i++) //loop starts from 2 because 0 and 1 are already printed
		{
			n3= n1 + n2;           
			System.out.print(" "+ n3);
			
			n1 = n2;
			n2 = n3;
			
		}
		
		
	}

}

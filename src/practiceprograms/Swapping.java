package practiceprograms;

public class Swapping {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping value a is : " + a);
		System.out.println("Before Swapping value b is : " + b);
		
		int c;
		
		c = a;  //c is 10
		a = b;  //a is 20
		b = c;	//b is 10
		
		System.out.println("After Swapping value a is : " + a);
		System.out.println("After Swapping value b is : " + b);
		
	}

}

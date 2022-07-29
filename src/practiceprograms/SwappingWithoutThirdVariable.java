package practiceprograms;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 50;
		System.out.println("Before Swapping value a is : " + a);
		System.out.println("Before Swapping value b is : " + b);
		
		//swapping
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping value a is : " + a);
		System.out.println("After Swapping value b is : " + b);
		
		
	}

 }
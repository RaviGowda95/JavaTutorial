package arrays;

public class ArrayExample3 {

	public static void main(String[] args) {

		int a[] = {100,200,300,400,500}; // we can store any number of elements
		
		int sum = 0;
		for (int x : a)
		{
			System.out.println(x);
			sum = sum + x;  //100  300 600 1000 1500
		}
		System.out.println(sum);
		
		
	}

}

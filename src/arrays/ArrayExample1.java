package arrays;

import java.util.Iterator;

public class ArrayExample1 {

	public static void main(String[] args) {

		
	int a[] = new int[5];  //declaration of array with 5 elements	
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[0]);
		
		
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		
		for(int x : a) {
			System.out.println(x);
		}
		
	}
}

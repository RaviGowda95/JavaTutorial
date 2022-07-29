package practiceprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayWithSortMethod {

	public static void main(String[] args) {

		int a[] = {0,2,5,1,6,9,7,8,3,4}; // primitive data type
		Integer a1[] = {0,2,5,1,6,9,7,8,3,4};// ***int is in full form Integer for sorting in desc order
		
		//Ascending Order
		Arrays.sort(a);  // sorting array a[] using Array.sort() method in ascending order
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("*****************");
		
		//Descending Order
		Arrays.sort(a1,Collections.reverseOrder());   // sorting array a1[] using Collections.reverseOrder() in Array.sort() method in descending order
		for(int i = 0; i<a1.length; i++)
		{
			System.out.println(a1[i]);
		}
		
	}


}

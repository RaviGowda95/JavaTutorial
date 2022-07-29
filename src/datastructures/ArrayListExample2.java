package datastructures;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Welcome");
		al.add(10);
		al.add(10.51);
		al.add('R');
		al.add(true);
		
		System.out.println("size of array list: " + al.size());
		System.out.println(al);
		
		//inserting elements in to the array list
		al.add(0, "Java Tutorial");
		al.add(2, 1234);
		
		System.out.println("size of array list: " + al.size());
		System.out.println(al);
		
		//removing elements from array list
		al.remove(10.51);
		
		System.out.println("size of array list: " + al.size());
		System.out.println(al);
		
		
		
		
	}

}

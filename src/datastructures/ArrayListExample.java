package datastructures;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList <String> al = new ArrayList <String>();
		
		//adding elements to array list
		al.add("Raj");
		al.add("Ravi");
		al.add("Pavan");
		al.add("Simran");
		al.add("Parvinder");
		
		System.out.println(al.size());  //printing number of elements from array list al
		for (String i : al)
		{
		System.out.println(i);   //reading elements from array list
		}
	}

}

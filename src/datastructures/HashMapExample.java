package datastructures;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Ashok");
		hm.put(2, "Suraj");
		hm.put(3, "Akash");
		hm.put(4, "Dinesh");
		hm.put(5, "Nikhil");
		hm.put(6, "Sanju");
		
		System.out.println(hm);
		
		for(Entry<Integer,String> e : hm.entrySet()) 
		{
			System.out.println(e);
		}
		
		System.out.println(hm.keySet());
		System.out.println(hm.get(2));
		
		System.out.println(hm.containsKey(5));
		System.out.println(hm.containsValue("Nikhil"));
	//	hm.remove(6);
		System.out.println(hm);
		hm.replace(6, "Prajwal");
		hm.replace(6, "Prajwal", "Pankaj");
		System.out.println(hm);
	
		
		
		
		
	}

}

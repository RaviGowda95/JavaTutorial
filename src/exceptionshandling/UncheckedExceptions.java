package exceptionshandling;

public class UncheckedExceptions {

	public static void main(String[] args) {

		
//		int a =10;
//		System.out.println(a/0);  //Arithmetic Exception
		
//		String s = null;
//		System.out.println(s.length()); //Null pointer Exception
		
		String st = "abc";
//		int i = Integer.parseInt(st);   //converting string value  to integer
//		System.out.println(i);         //NumberFormatException
		
		int a[] = new int[4];     //array size is of 4 but we are saying 8th position value is 100
		a[8]=100;                      //ArrayIndexOutOfBoundsException  
		
		
	}

}

package exceptionshandling;

public class TryCatchFinally {

	public static void main(String[] args) {

		int a[] = new int[4];     //array size is of 4
	
		
		try {
			a[8]=100;                   //ArrayIndexOutOfBoundsException   
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			a[8]=100;                   //ArrayIndexOutOfBoundsException   
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}
		
		
//		try {
//			a[4]=100;                   //ArrayIndexOutOfBoundsException   
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("This is finally block");
//		}
		
		
	}

}

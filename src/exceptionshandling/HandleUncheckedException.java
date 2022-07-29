package exceptionshandling;

public class HandleUncheckedException {

	public static void main(String[] args) {
		
		
		System.out.println("Program is started");
		
		int a =10;
		try {
			System.out.println(a/0);  //Arithmetic Exception
			
		} catch (ArithmeticException e) {
			e.getMessage();
		}
		
		String s = null;
		
		try {
			System.out.println(s.length()); //Null pointer Exception
		} catch (NullPointerException e) {
			e.getMessage();
		}
		
		System.out.println("Program is completed");

	}

}

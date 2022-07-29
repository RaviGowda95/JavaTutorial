package exceptionshandling;

public class ExceptionsExample {

	public static void main(String[] args) {

		System.out.println("started");
		//Thread.sleep(2000);         //Interrupted Exception
		
		int i =10;
		System.out.println(i/0);  //Arithmetic Exception
		System.out.println("stopped");
		
		
		
	}

}

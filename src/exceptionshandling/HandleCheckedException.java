package exceptionshandling;

public class HandleCheckedException {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program is started");	
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Thread.sleep(2000);  //adding throws keyword
		
		System.out.println("Program is completed");




	}

}

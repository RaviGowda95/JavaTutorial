package interfaces;


interface TestInt 
{
	int a =10; //by default variables are static& final in interface
	void display(); //abstract method
	
}



public class InterfaceExample implements TestInt{
	
	
	public void display() {
		
		System.out.println(a);
	}

	public static void main(String[] args) {

		InterfaceExample obj = new InterfaceExample();
		obj.display();
	}

}

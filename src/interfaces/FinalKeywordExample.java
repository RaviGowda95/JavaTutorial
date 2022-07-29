package interfaces;


 class Test
{
	final int a =10;
	
	final void m1() {
		//a =20; // it is invalid becoz a is final variable
		System.out.println(a);
	}	

}

class Test123 extends Test
{
//	void m1() {  //not valid bcoz method m1 is final method
//		System.out.println("m1 is overriden");
//	}
}




public class FinalKeywordExample {
	public static void main(String[] args) {
		
	}

}

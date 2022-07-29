package accessmodifiers;

class A {
//	private int i = 10;
//	private void m1() {
//		System.out.println(i);
//	}
	int i = 10; // default access modifier

	void m1() { // default access modifier
		System.out.println(i);
	}

}

public class AccessModifiersExample {

	

	public static void main(String[] args) {

		 A aobj = new A();
		// aobj.i=10; cannot access as it's access modifier is private
		// aobj.m1(); cannot access as it's access modifier is private
		 aobj.i=10;
		 aobj.m1();
	}

}

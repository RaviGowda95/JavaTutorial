package oops;

public class staticExample {
	
	int a; //non static variable
	static int b; //static variable
	
	
	static void m1() {//Static
		System.out.println("This is m1 - Static method");
	}
	
	void m2() { //Non- Static
		System.out.println("This is m2 - Non-Static method");
	}
	
	void m3() {  //Non- Static
		a=10;
		b=20;
		m1();
		m2();
	}
	

	public static void main(String[] args) {   //static method
		
	//	Static method can only directly access static stuff(both variable & method without creating any object)	
	b = 100;
	System.out.println(b);
	m1();
	
	//a=200;   not accessible, bcoz it is non static variable
	//m2();    not accessible, bcoz it is non static method
	
	staticExample objs = new staticExample();
	objs.m2();
	objs.a=200;
	System.out.println(objs.a);
	
		
	}

}

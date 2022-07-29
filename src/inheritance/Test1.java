package inheritance;

class A
{
	int a;
	int b;
	
	public void display() {
		System.out.println(a+b);
	}
	
}

class B extends A
{
	int x;
	int y;
	
	public void	show() {
		System.out.println(x+y);
	}
	
}

class C extends B
{
	int p;
	int q;
	
	public void	addition() {
		System.out.println(p+q);
	}
	
}

public class Test1 {
	
	public static void main(String[] args) {
		
		A aobj= new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();
		
		B bobj= new B();
		bobj.x=200;
		bobj.y=20;
		bobj.show();
		bobj.a=150;
		bobj.b=50;
		bobj.display();
		
		C cobj = new C();
		cobj.p =20;
		cobj.q =30;
		cobj.a =40;
		cobj.b =50;
		cobj.x =60;
		cobj.y =70;
		cobj.display();
		cobj.show();
		cobj.addition();
		
		
	}
	
	
	
}

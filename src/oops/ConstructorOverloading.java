package oops;

public class ConstructorOverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	
	ConstructorOverloading(){
		a= 10;
		b= 20;
		c= 20.5;
	}
	
	ConstructorOverloading(int a,int b){
		this.a=a;   //using This keyword to use same external variable names as local variables
		this.b=b;
	}
	ConstructorOverloading(int x,double y){
		a=x;
		c=y;
	}
	ConstructorOverloading(int x,int y,double z){
		a=x;
		b=y;
		c=z;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		//ConstructorOverloading objco = new ConstructorOverloading();
		//ConstructorOverloading objco = new ConstructorOverloading(10,20);
//		ConstructorOverloading objco = new ConstructorOverloading(10,20.5);
		ConstructorOverloading objco = new ConstructorOverloading(10,20,20.5);
		objco.display();
		
		
	}
	
}

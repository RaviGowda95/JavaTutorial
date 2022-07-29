package oops;

public class MethodOverloading {

	int a;
	int b;

	void Sum(){
		a=10;
		b=5;
		System.out.println(a+b);
	}

	void Sum(int a, int b){
		this.a= a;    //using This keyword to use same external variable names as local variables
		this.b= b;
		System.out.println(a+b);
	}
	

	void Sum(int x, int y,int z){
		System.out.println(x+y+z);
	}

	void Sum(int x, double y){
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		MethodOverloading objmo = new MethodOverloading();

		objmo.Sum();
		objmo.Sum(10, 20);
		objmo.Sum(10,20,30);
		objmo.Sum(10,20.5);



	}

}

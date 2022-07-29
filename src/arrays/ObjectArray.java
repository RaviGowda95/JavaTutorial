package arrays;

public class ObjectArray {

	public static void main(String[] args) {

		
		Object a[] = new Object[5];
		a[0] = 10;  //integer
		a[1] = 12.5; //double
		a[2] = "Hello"; //string
		a[3] = 'G'; //char
		a[4] = true; //boolean
		
		
	//	Object b[] = {11,12.56,"hello there",'g',false};
		
		for (Object x : a)
		{
			System.out.println(x);
		}
				
				
				
	}

}

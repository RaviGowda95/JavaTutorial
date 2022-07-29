package arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String s[]= new String[3];
		s[0]= "Welcome";
		s[1]="to";
		s[2]="Tutorial";
		System.out.println(s.length); //returns length of an array
		
		for (String x : s)
		{
			System.out.println(x);
		}
		
		
		
		
	}

}

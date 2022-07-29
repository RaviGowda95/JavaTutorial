package arrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {

		int a[][] = { {10,20,30} , {40,50,60} , {70,80,90}, {100,110,120} , {130,140,150} };
		
		for (int i[] : a)
		{
			for (int j : i)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
			
		
		
	}

}

package practiceprograms;

public class SortingArrayWithoutSortMethod {

	public static void main(String[] args) {

		int a[] = {0,2,5,1,6,9,7,8,3,4};
		
		//sorting logic
		for (int i = 0; i<a.length; i++)
		{
			
			for (int j = i+1; j<a.length; j++)
			{
				int temp = 0;
				if(a[i]>a[j])   //****For Ascending a[i]>a[j] & for Descending a[i]<a[j]
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
			System.out.println(a[i]);
		}
		
	}

}
 
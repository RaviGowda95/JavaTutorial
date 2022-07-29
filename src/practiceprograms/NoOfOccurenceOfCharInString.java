package practiceprograms;

public class NoOfOccurenceOfCharInString {

	public static void main(String[] args) {

		String s = "acaabaad";
		char c = 'a';
		int count = 0;
		
		for(int i = 0; i<s.length();i++)
		{
			if (s.charAt(i) == c )
			{
				count++;
			}
			
		}
		System.out.println("character '" + c + "' ocurred " + count + " times");
		
	}

}

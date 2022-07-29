package practiceprograms;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {

		String s = " Selenium    Tu  tori   al";
		System.out.println(s.replaceAll("\\s", ""));
		
	}

}

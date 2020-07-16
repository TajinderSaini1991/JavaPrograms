package DataConversion;

public class Immutability {

	public static void main(String[] args) {


		String s = "Selenium";
		System.out.println(s.substring(2, 4));
		System.out.println(s);
		
		
		String s2 = s.substring(2, 4);
		System.out.println(s2);
		System.out.println(s);
		
		
		
		s = s.substring(2,4);
		System.out.println(s);
		
		
		
		
		

	}

}

package DataConversion;

public class ReverseString {

	public static void main(String[] args) {

		String rev = reverse("Tajinder");
		System.out.println(rev);
	}

	public static String reverse(String s) {
		String rev = " ";

		if (s.length() == 1) {
			return s;
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}

		return rev;
	}
}
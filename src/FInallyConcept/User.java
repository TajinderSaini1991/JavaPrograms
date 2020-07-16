package FInallyConcept;

public class User {

	public static void test() {

		System.out.println("Hii");

		try {
			int i = 9 / 3;
		} 
		catch (Exception e) {
					System.out.println("/ by zero issue");
		}
		finally{
			System.out.println("This is finally block");
		}
System.out.println("abc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
	}

}

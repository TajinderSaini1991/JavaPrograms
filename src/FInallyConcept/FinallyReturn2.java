package FInallyConcept;

public class FinallyReturn2 {

	public static int test(String name) {

		if (name.equals("Tom")) {
			try{
			int i =9/0;}
			catch(Exception e){
				return -1;
			}
			finally{
				System.out.println("this is finally block");
			}
			
			
			
		}

		else if (name.equals("Smith")) {
			return 20;
		}

		else {
			return -1;
		}
    return 20;
	}

	public static void main(String[] args) {
		
		System.out.println(test("Tom"));

	}


}

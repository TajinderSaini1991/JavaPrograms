package FInallyConcept;

public class FinallyReturn {

	public static int test(String name) {

		if (name.equals("Tom")) {
			try{
			int i =9/0;}
			catch(Exception e){
				return -1;
			}
			finally{
				return -10;
			}
			
			
			
		}

		else if (name.equals("Smith")) {
			return 20;
		}

		else {
			return -1;
		}
    
	}

	public static void main(String[] args) {
		
		System.out.println(test("Tom"));

	}

}

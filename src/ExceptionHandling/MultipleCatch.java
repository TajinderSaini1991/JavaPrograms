package ExceptionHandling;

public class MultipleCatch {
String name = "taj";
	public static void main(String[] args) {

		System.out.println("abc");
		System.out.println("abc");
		System.out.println("abc");
		System.out.println("abc");
		
	try {
		//int i =  8/0;
        MultipleCatch n = null;
		
		System.out.println(n.name);
	} 
	catch (NullPointerException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}	catch(ArithmeticException e){
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
		
	System.out.println("bye");	
		

	}

}

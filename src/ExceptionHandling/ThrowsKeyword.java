package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args)   {
		ThrowsKeyword obj = new ThrowsKeyword();
	try{obj.getName();}
	catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("abc");
	}

	public void getName() throws ArithmeticException{
		System.out.println("get  name");
		getValue();
	}
	
	
	public void getValue() throws ArithmeticException{
		System.out.println("get value");
		getNumber();
	}
	
	public void getNumber()throws ArithmeticException{
		System.out.println("Get number");
		int i = 9/0;
		System.out.println("aa");
	}
	
	
	
	
	
	
	
	
	
}

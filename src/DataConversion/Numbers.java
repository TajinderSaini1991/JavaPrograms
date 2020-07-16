package DataConversion;

//import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
	String s = "1200";
	int i = 12;
	System.out.println(Integer.parseInt(s)+i);
		
	String y = "100AB";
	try{
	int m = Integer.parseInt(y);
	System.out.println(m);}
	catch(Exception e){
		
	}
	
	String str = "11.365";
	Double d = Double.parseDouble(str);
	System.out.println(d+100);
	
	int x = 120;
	String z = String.valueOf(x);
	System.out.println(z+20);
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter name");
//	System.out.println("The name is : "+sc.nextLine());
//	System.out.println("Enter age");
//	System.out.println("age is "+ sc.nextInt());
//	System.out.println("enter gender");
//	System.out.println("Gender is "+ sc.next().charAt(0));
//	System.out.println("Enter Salary ");
//	System.out.println("The salary is :"+ sc.nextDouble());
	
	System.out.println("The max value of integer is "+ Integer.MAX_VALUE);
	System.out.println("The min value of integer is :"+ Integer.MIN_VALUE);
	
	System.out.println(Integer.MAX_VALUE + 3);

	}

}

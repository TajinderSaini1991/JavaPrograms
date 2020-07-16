package Assignments;



public class Methods {
	
	int a;
	int age;

	// Define a program to find out whether a given number is even or odd.
	public void typeOfNumber() {

		 
		if (a % 2 == 0) {
			System.out.println("number is even " + a);
		} else {
			System.out.println("number is odd" + a);
		}

	}

	public void eligibility() {
		if (age >= 18) {
			System.out.println("Person is eligible to vote");
		} else {
			System.out.println("Person is not eligible to vote");
		}
	}
	 
		
		
		public  void userMarks(int marks){
		
		if(marks >=91 && marks<=100){
			System.out.println("Grade is AA");
		}
		else if(marks >=81 && marks<=90){
			System.out.println("Grade is AB");
		}	
		else if(marks >=71 && marks<=80){
			System.out.println("Grade is BB");
		}		
	    else if(marks >=61 && marks<=70){
			System.out.println("Grade is BC");
		}		
		else if(marks >=51 && marks<=60){
			System.out.println("Grade is CC");
		}	
		else if(marks >=41 && marks<=50){
			System.out.println("Grade is CD");
		}	
		else if (marks<=40){
			System.out.println("Fail");
		}}
		
		
	      // Write a program to print the circumference and area 
		//of a circle of radius entered by user by defining your own method.
		public void area(float radius) {
			float ar = 3.14f * radius * radius;
			float cr = 2*3.14f*radius;
			System.out.println("The area of circle is " + ar);
			System.out.println("The circumference of circle is " + cr);
		}
		


		// Write a program to print the factorial of a number by defining a method
			// named 'Factorial'.

			public  void Factorial(long n) {

				for (long i = (n - 1); i >= 1; i--) {

					n = n * i;}
				System.out.println("factorial is " + n);}
			
          	public static void main(String[] args) {
          	
	       Methods obj = new Methods();
	       obj.area(5.8f);
           obj.Factorial(7);
           obj.a= 45;
           obj.typeOfNumber();
           obj.age=40;
           obj.eligibility();
//			System.out.println("Enter your marks ");
//			Scanner input = new Scanner(System.in);
//			int marks = input.nextInt();
//			
//			obj.userMarks(marks);
//			input.close();
//			
	
	
	
	
	
//	obj.typeOfNumber();
//	obj.eligibility(25);	
//	
	
	
	
	
		
		
	}

}

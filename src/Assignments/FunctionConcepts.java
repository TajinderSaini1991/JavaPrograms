package Assignments;

public class FunctionConcepts {

	public static void main(String[] args) {

		FunctionConcepts f = new FunctionConcepts();
		// Define a program to find out whether a given number is even or odd.

		Methods obj = new Methods();
		obj.typeOfNumber();

		// A person is eligible to vote if his/her age is greater than or equal
		// to 18. Define a method to find out if he/she is eligible to vote.
		
		//int age = 25;
		//obj.eligibility(age);
		// Define a method to find out if number is prime or not. 
		//Define a method to find out if number is prime or not.
		
		 // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
		f.area(5.25f);
		
		
		

		// Define two methods to print the maximum and the minimum number
		// respectively among three numbers entered by user.

		f.greatest(56, 85, 100);
		f.minimum(100, 50, 10);

	}
	
	public void area(float radius) {
		float ar = 3.14f * radius * radius;
		System.out.println("The area of circle is " + ar);
	}
	
	
	
	
	

	public void greatest(int x, int y, int z) {
		if (x > y && x > z) {
			System.out.println("greatest number is " + x);
		} else if (y > z) {
			System.out.println("greatest number is " + y);
		} else {
			System.out.println("greatest number is " + z);
		}
	}

	public void minimum(int x, int y, int z) {
		int m;
		m = x < y ? x : y;
		m = m < z ? m : z;
		System.out.println("the minimum number is " + m);

	}

	

	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public int product(int a, int b) {
		int res = a * b;
		return res;
	}

}

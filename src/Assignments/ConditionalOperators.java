package Assignments;



public class ConditionalOperators {

	public static void main(String[] args) {
	//Take four numbers from the user and print the greatest number.	
	int a1=25;
		int a2= 78;
		int a3= 87;
		int a4=101;
		int a5;
		
		a5=a1>a2?a1:a2;
		a5=a5>a3?a5:a3;
		a5=a5>a4?a5:a4;
		System.out.println("The greatest number is "+a5);
		
		int a6=10;
		int b6=25;
		int c6=30;
		
		int result =  (a6>b6)? (a6>c6?a6:b6)         :  (b6>c6?b6:c6)        ;
                    
		System.out.println(result+" grestest");
		
		// dead code
		//if (false){
		//System.out.println("dead code");
		//}
		//else{
//			System.out.println("dead code warning");
		//}
		
		
		
		
		
		
		
		
		// Write a Java program to check the eligibility for vote
		int age = 20;
		int time = 4;
		if (age >= 18 && time > 3) {
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}

		// Maintain one Student name and do the following conditions:
		// Using if-elseif
		String name = "Smith";
		if (name == "Virat") {
			System.out.println("The score is 100");
		} else if (name == "Smith") {
			System.out.println("The score is 90");
		} else if (name == "Sachin") {
			System.out.println("The score is 200");
		} else if (name == "Werner") {
			System.out.println("This player not found");

		}

		// Using Switch -Case
      	String player_name = "Sachin";
		switch (player_name) {
		case "Virat":
			System.out.println("The score is 100");
			break;
		case "Smith":
			System.out.println("The score is 90");
			break;
		case "Sachin":
			System.out.println("The score is 200");
			break;
		case "Werner":
			System.out.println("This player not found");
			break;}
        // Java Program to Swap Two Numbers with and without 3rd variable
		int a = 10;
		int b = 20;
		int c;
		System.out.println("Before swapping:" + " a=" + a + " b=" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("Numbers after swapping are :" + " a=" + a + " b=" + b);
		// without 3rd variable
		float d = 500f;
		float e = 200f;
		System.out.println("Before swapping:" + " d=" + d + " e=" + e);
		d = d / e;
		e = d * e;
		d = e / d;
       System.out.println("Numbers after swapping are :" + " d=" + d + " e=" + e);

	// Java Program to Check Whether a Number is Even or Odd
		int n = 3;

		if (n % 2 == 0) {
			System.out.println("number is even:" + n);
		} else {
			System.out.println("number is odd: " + n);
		}

		// Java Program to Check Whether an Alphabet is Vowel or Consonant
		char al = 'p';
		if (al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u') {
			System.out.println("Alphabet is Vowel " + al);
		} else {
			System.out.println("Alphabet is consonant " + al);
		}

	}

}

package Assignments;

public class Strings {

	public static void main(String[] args) {

		// 1. Write a program to check two different strings equality.
		String s1 = "Welcome here";
		String s2 = "welcome here";

		if (s1.equals(s2)) {
			System.out.println("The strings are equal");
		}

		else {
			System.out.println("Strings are not equal");
		}

		// 2. Remove all spaces in a String .
		String s = " Hello  every one ";
		System.out.println(s.replace(" ", ""));

		// 3. Write a program that will
		// print out last character and first character of a word.

		String c = "Hello";
		System.out.println(c.charAt(0) + " " + c.charAt(c.length() - 1));

		// Write a program to verify a word or a character
		// contains in the sentence.

		String t = "Hi this is java class";
		if (t.contains("java")) {
			System.out.println("java is present");
		}

		// Write a function/ method to reverse your own name.
		String name = "Tajinder";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.print(rev);

		System.out.println(" ");

		// 6. Write a program that gives you last half of the string.

		String h = "Tajindersaini";
		int l = h.length(); // 13
		System.out.println(l);
		System.out.println(h.substring(l / 2));
        System.out.println("+++++++++++");
		

		// 7.Write a program to get the 3rd “ e “ of the string .
		// For example: “Welcome to Naveen Automation Lab ! “.
		/*String seny = "Welcome to Naveen Automation Lab ! ";//14
		int occurance = 3;
		char ch ='e';
		int index =1; 
		//String temp;
		for (int f = 0;f<=occurance;f++){
		
			
			
			
		}*/
        
        String str = "Welcome to Naveen Automation Lab ! ";
        int index =0;
        char ch = 'e';
        for(int i=0;i< str.length();i++ ){
        	if(str.charAt(i)==ch && index<3){
        		index = index+1;
        		System.out.println("index: "+i);
        	}    	
        }
			
		
		
		
		
		
		

		// 10. Assume that a string consists of 3 words, print out the middle
		// one

		String st = "Tom";
		System.out.println(st.charAt(st.length() / 2));

		// if even
		String st1 = "tajindersa"; // 10, n,d(4,5)

		int t1 = st1.length() / 2 - 1;
		int t2 = t1 + 2;
		int t3 = t1 + 1;
		System.out.println(st1.charAt(t1) + " " + st1.charAt(t3));
		System.out.print(st1.substring(t1, t2));
		System.out.println("********");

		String sen = "This is java";

		int j = sen.indexOf(" ");
		int k = sen.indexOf(" ") + 3;
		System.out.println(j + " " + k);
		System.out.println(sen.substring(j, k));
		String sentence = "hello this is java";
		String words[] = sentence.split(" ");
		int length = (words.length) / 2;
		System.out.println("in odd length case the middle word is :" + words[length]);
		System.out.println("in even case middle words are: " + words[length - 1] + " " + words[length]);
		// System.out.println("the middle word is :" +words[3]);

		System.out.println("*******");

		// Write a program that breaks a whole string into small strings, and
		// print out its all values . (Hint: split, loop) .
		String g = "maths-science-social-arts";
		String arr[] = g.split("-");
		for (String gu : arr) {
			System.out.println(gu);}

			// get only numeric part from this String:
			 String stg = "your transaction id is: 12345 and reference id is 34567";
			String data[] = stg.split(" ");
			System.out.println(data[4]+" "+data[data.length-1]);

			// Write a method which gives index of (-1) if string is not
			// available. . it should return integer. if String is present, then
			// it should return the specific index.
			
		

	
	
	
	
	}

}

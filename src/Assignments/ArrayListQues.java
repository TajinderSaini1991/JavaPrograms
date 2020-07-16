package Assignments;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListQues {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Pink");
		colors.add("purple");
		colors.add("Black");
		colors.add("Orange");
		 System.out.println("\nOriginal array list: " + colors);

		for (String s : colors) {
			System.out.println(s);
		}
		System.out.println("**********");
		colors.add(0, "Green");// to insert an element into the array list at
								// the first and last positions.
		colors.add(colors.size(), "White");
		
		
		for (String st : colors) {
			System.out.println(st);
		}

		System.out.println("**********");
		System.out.println("element at 4th index :"+colors.get(4));// to retrieve an element (at a
											// specified index) from a given
										// array list.

		System.out.println("**********");
		colors.set(5, "Red");// to update specific array element by given
								// element.
		System.out.println(colors.get(5));
		System.out.println("**********");

		colors.remove(2); // to remove 3rd element
		
		// to search an element in a array list.
		for (String s : colors) {
			if (s.contains("Black")) {
				System.out.println("the color is " + s);

			}
		}

		// to reverse elements in a array list

		System.out.println("Elements before reversing :"+colors);
		
		Collections.reverse(colors);
		
		
		
		System.out.println("Elements after reversing :" +colors);
	   
	
	    System.out.println("\n"+"**********");
	    
	    
	    // to extract a portion of a array list
	    System.out.println(" Original array list :");
	   
		for (String st : colors) {
			System.out.print(st +" ");
		}System.out.println("\n");
		  System.out.println(" extracting a portion array list :");

		    System.out.println(colors.subList(0, 3));
		    
	    //swap two elements in an array list.
	    System.out.println("\n");
	    ArrayList<String> arr = new ArrayList<String>();
	    
	    arr.add("Apple");
	    arr.add("banana");
	    System.out.println("Before Swapping: "+arr);
	    
	    Collections.swap(arr, 0, 1);
	    System.out.println("After swapping"+"\n"+ arr);
	    
	    // to trim the virtual capacity of an array list 
	    // the current list size.
	      colors.trimToSize();
	    
	    
	    
	    
	  // to empty an array list.
	    arr.clear(); 
	  //  to print all the elements 
	    //of a ArrayList using the position of the elements
	
	    ArrayList<Integer> in= new ArrayList<Integer>();
	    in.add(12);
	    in.add(56);
	    in.add(47);
	    in.add(44);
	    System.out.println(in);
	    
	    for(int i=0;i<in.size();i++){
	    	  System.out.println(in.get(i));
	    }
	  
	    
	    
	    
	    
	    
	
	}

}























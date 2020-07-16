package DailyTopics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("JOhn");
		ar.add(12.33);

	System.out.println(ar.size());	
	ar.remove(1);
	System.out.println(ar.get(1));
	
	System.out.println(" ");
		ar.add(true);
		ar.add(56.33);
		ar.add('e');
		ar.add(null);
		for(int i =0;i<ar.size(); i++){
		System.out.println(ar.get(i));
		
		}
		System.out.println("***** ");	
	   ar.add(3, "scott");	
	   for(int i =0;i<ar.size(); i++){
		System.out.println(ar.get(i));
		
		}
	   System.out.println("***** ");
	for (Object g:ar){
		System.out.println(g);	
	}
	  System.out.println("***** ");
	ArrayList<Integer> in = new ArrayList<Integer>();
	in.add(100);
	in.add(200);
	in.add(300);
	
	for(int f:in){
		System.out.println(f);
	}
	
	System.out.println("***** ");
	ArrayList<String> st = new ArrayList<String>();
	st.add("100");
	st.add("John");
	st.add("Scott");
	
	for(String fs:st){
		System.out.println(fs);
	}
	
	
	
	
	
	
	
	}

}

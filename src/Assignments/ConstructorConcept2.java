package Assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ConstructorConcept2 {
	
	 String name;
	String country;
	String date;
	ArrayList <String> courses;
	
	




	public String getName() {
		return name;
	}






	public String getCountry() {
		return country;
	}






	public String getDate() {
		return date;
	}






	public ArrayList<String> getCourses() {
		return courses;
	}






	
	public ConstructorConcept2(String name) {
	
		this.name = name;
	}






	public ConstructorConcept2(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}






	public ConstructorConcept2(String name, String country, String date) {
		super();
		this.name = name;
		this.country = country;
		this.date = date;
	}






	public ConstructorConcept2(String name, String country, String date, ArrayList<String> courses) {
		super();
		this.name = name;
		this.country = country;
		this.date = date;
		this.courses = courses;
	}






	public static void main(String[] args) throws ParseException {
		
		
		ConstructorConcept2 ab = new ConstructorConcept2("simran");
		System.out.println(ab.getName());
		ConstructorConcept2 ab1 = new ConstructorConcept2("simran","USA");
		System.out.println(ab1.getName()+":"+ab1.getCountry());
		//Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("1967-12-05");
		System.out.println(date);
		ConstructorConcept2 ab2 = new ConstructorConcept2("simran","USA",new  SimpleDateFormat("yyyy/MM/dd").format(date));
		System.out.println(ab2.getName()+":"+ab2.getCountry()+":"+ab2.getDate());
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("C++");
		list.add("Python");
		//ConstructorConcept2 ab3 = new ConstructorConcept2("SImran", "USA", format.parse("19690514"), list);
		//System.out.println(ab3.getName()+":"+ab3.getCountry()+":"+ab3.getDate()+":"+ab3.getCourses());

	}

}

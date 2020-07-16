package Assignments;

import java.util.ArrayList;

public class University {

	String name;
	String country;
	String date;
	ArrayList<String> courses;

	public University(String name) {

		this.name = name;
	}

	public University(String name, String country) {
		this.name = name;
		this.country = country;

	}

	public University(String name, String date, ArrayList<String> courses) {
		this.name = name;
		this.date = date;
		this.courses = courses;

	}

	public University(String name, String country, String date, ArrayList<String> courses) {
		this.name = name;
		this.country = country;
		this.date = date;
		this.courses = courses;

	}

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

	public static void main(String[] args) {

		University a = new University("GNDU");

		System.out.println(a.getName());

		University b = new University("SanJose State University", "USA");
		System.out.println(b.getName() + " " + b.getCountry());

		ArrayList<String> list = new ArrayList<String>();
		list.add("Electronics");            
		list.add("Software Systems");
		list.add("Arts");
		list.add("History");

		University c = new University("UC Davis", "1966.06.14", list);
		System.out.println(c.getName() + " " + c.getDate() + " " + c.getCourses());

		ArrayList<String> courses = new ArrayList<>();
		courses.add("ECE");
		courses.add("CSE");
		courses.add("Arts and culture");
		courses.add("Food processing");

		University d = new University("Punjab University", "India", "1968.05.12", courses);
		System.out.println(d.getName() + " " + d.getCountry() + " " + d.getDate() + " " + d.getCourses());

	}

}

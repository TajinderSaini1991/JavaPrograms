package DailyTopics;

public class Nullreference {
	String name;
	int age;
	String location;

	public Nullreference(String name, int age, String location) {
		
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public static void main(String[] args) {

Nullreference n = new Nullreference("tom", 25, "NC");
n= null;
Nullreference n1;
System.out.println(n.name);



	}

}

package DailyTopics;

public class StaticNonStaticConcept {
	String name;
	String color;
	double price;
	String model;
	static int wheels = 4;
	
	
	
	
	public static void main(String[] args) {
		
		

		
		
			StaticNonStaticConcept c1= new StaticNonStaticConcept();
			StaticNonStaticConcept c2= new StaticNonStaticConcept();
			StaticNonStaticConcept c3= new StaticNonStaticConcept();

			c1.name = "Audi";
			c1.color = "Red";
			c1.price = 75;
			c1.model = "Q5";
			
			c2.name = "BMW";
			c2.color = "Blue";
			c2.price = 70;
			c2.model = "520d";
			
			c3.name = "Honda";
			c3.color = "Civic";
			c3.price = 40;
			c3.model = "ivtec";
			
		
			System.out.println(c1.name + " " +c1.price +" " +wheels);
			System.out.println(c2.name + " " +c2.price + " " + c2.model + " "+StaticNonStaticConcept.wheels );

	
          System.out.println(c1.isUSCitizen("Naveen"));

			

	}
	public int isUSCitizen(String name) {
		//boolean flag = false;

		if (name.equalsIgnoreCase("Naveen")) {
			return 32;
		} 
		else if (name.equalsIgnoreCase("Tom")) {
			//flag = false;
			return 65;
		} 
		else if (name.equalsIgnoreCase("Peter")) {
			//flag = true;
			return 33;
		}
		// return flag;
		return 100;

	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

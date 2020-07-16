package SuperKeywordConcept;

public class Car {
	
	
	
	public  Car(){
		System.out.println("CAR constructor ");
	}
	public Car(int i){
		System.out.println("CAR constructor " +i);
	}
	
	public Car(int i, int j ){
		System.out.println("CAR constructor " +(i+j));
	}
	

	int max_speed =100;
	String color = "black";
	int price = 800000;
	public void start(){
		System.out.println("start--CAR");
	}
	
	
	
	
}

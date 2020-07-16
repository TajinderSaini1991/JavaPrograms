package MethodOverriding;
// parent
public class Car extends Vehicle {
	public int a = 10;
	public static int var = 20;
	public void start(){
		System.out.println("Car--start");
		
	}
	public void stop(){
		System.out.println("Car--stop");
		
		
	}
	public  void refuel(){
		System.out.println("Car--refuel");
	}
	
	public static void parentStatic(){
		System.out.println("static method of parent class");
	}

	
	@Override
	public void price(){
		System.out.println("CAR---- color");
	}
	
	
	
}

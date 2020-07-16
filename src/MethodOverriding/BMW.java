package MethodOverriding;

public class BMW extends Car {
@Override
	public void start(){
		System.out.println("BMW---start");
	}
// @Override will give error
	
	public  void autopark(){
		System.out.println("BMW--Autopark");
	}
	
	
	
	
	
}

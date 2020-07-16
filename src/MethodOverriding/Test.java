package MethodOverriding;

public class Test {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start(); 
		b.stop();
		b.autopark();
		System.out.println("a : "+ b.a); // non static accessed by object
		System.out.println("var static : "+ Car.var); // static accessed by classname
		
		System.out.println("********"); 
		Car c = new BMW();
		c.start(); // bmw start will be executed
		c.stop();
		c.refuel();
	//	c.autopark(); not allowed
   // Can't access individual methods of  BMW 
		System.out.println("a :" +c.a);
		System.out.println("static var is :"+ Car.var);
		
	//	b.parentStatic(); warning 
		//no use bcz it can be called directly by any class
		System.out.println("********"); 
		
		
		b.typeOfVehicle();
		b.color();
		System.out.println("********"); 
		
		Vehicle v = new BMW();
		v.typeOfVehicle();
		v.color();
		//v.start();  car class or BMW class methods cant be accessed
		v.price(); // Car class price (overridden method) will be executed
		
	
	}

}

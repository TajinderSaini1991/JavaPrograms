package InterfaceConcepts;

public class Fortis extends CDC implements USMedical, IndianMedical {

	@Override
	public void ortho() {
	System.out.println("India ---ortho");
	}

	@Override
	public void cardio() {
		System.out.println("India---cardio");
	}

	@Override
	public void ENT() {
		System.out.println("India ---ENT");	
		
	}

	@Override
	public void pedia() {
		System.out.println("US---pedia");	
		
	}

	@Override
	public void medicine() {
		System.out.println("US ---medicine");	
	}

	@Override
	public void surgery() {
		System.out.println("US ---surgery");
		
	}

	public void Xray(){
		System.out.println("Fortis---Xray");
	}
	// default methods can be used only in intefaces 
//	default void bill(){
//		System.out.println("default method");
//	}
	
	
	
	@Override
	public void def(){
		System.out.println("default --fortis");
	}
//	
	// cant override static method
//	@Override
//	public static void  fee(){
//		System.out.println("static method with body--US");
//	}
//	
	
	// treated as its own method not overridden
    public static void  fee(){
		System.out.println("static method with body--Fortis own method");
	}

	@Override // coming from grandparent interface WHO
	public void covid_19Test() {
		// TODO Auto-generated method stub
		
	}

	@Override //coming from grandparent interface WHO
	public void HepCTest() {
		// TODO Auto-generated method stub
		
	}	
	
	
	
}

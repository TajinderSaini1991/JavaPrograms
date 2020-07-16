package InterfaceConcepts;

public class Test {

	public static void main(String[] args) {
		Fortis fh = new Fortis();
		//India
		fh.cardio();
		fh.ENT();
		fh.ortho();
	fh.vaccination();  // parent class inherited method
	
		
		
		//us overridden methods
		fh.pedia();
		fh.surgery();
		fh.medicine();
		
		fh.Xray();
		System.out.println("*******");
		
		USMedical us = new Fortis();
		us.pedia();
		us.surgery();
		us.medicine();
		
		//Fortis methods and Indian methods not allowed
		
		// variables
		System.out.println("billing :"+ USMedical.billing);
		//System.out.println("billing :"+ us.billing);  warning static
		
		 USMedical.fee();
		
		 // default
		fh.def(); 
		us.def();
		
		 
		
		
	}

}

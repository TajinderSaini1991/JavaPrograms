package InterfaceConcepts;

public interface USMedical extends WHO {
int billing = 20; // public final static by default
	
	public void pedia();
	public void medicine();
	public void surgery();
	
	
	
	public static void  fee(){
		System.out.println("static method with body--US");
	}
	
	
	default void def(){
		System.out.println("default method--US");
	}
}

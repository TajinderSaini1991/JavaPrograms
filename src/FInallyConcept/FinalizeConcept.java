package FInallyConcept;

 class FinalizeConcept {
	

	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		f1 = null;
		System.gc();
		System.out.println("main completes");
		


	}



public void finalize(){
	System.out.println("This is finalize");
}
}
package AbstractClasses;

public abstract class Webdriver {
	
	public Webdriver(){
		System.out.println("Webdriver constructor");
	}
	abstract void get();
	abstract void geturl();
	abstract void getTitle();
	abstract void findElement();
	abstract void getText();
	
	public static  void close(){
		System.out.println("Close the driver-- Webdriver");
		
	}
	
	public final void  waitTime(){
	System.out.println("wait for page to load--Webdriver");	
		
	}
	
	
	
	

}

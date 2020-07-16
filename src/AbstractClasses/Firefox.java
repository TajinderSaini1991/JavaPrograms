package AbstractClasses;

public class Firefox  extends RemoteWebdriver{

	@Override
	void geturl() {
	System.out.println("Get URL--FF");
		
	}

	@Override
	void getTitle() {
	
	System.out.println("GEt Title--FF");	
	}

	@Override
	void findElement() {
		
		System.out.println("Find Element--FF");
	}

	@Override
	void getText() {
		
	System.out.println("Get Text--FF");	
	}

	
	public void switchToAlert(){
	System.out.println("switch to alert--FF");
	}

	@Override
	void get() {
		System.out.println("code to launch ff browser");
		
	}
}

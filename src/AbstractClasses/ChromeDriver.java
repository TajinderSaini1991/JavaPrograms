package AbstractClasses;

public class ChromeDriver extends RemoteWebdriver {
	
	
	public ChromeDriver(){
		System.out.println("ChromeDriver Constructor");
	}

	@Override
	void geturl() {
		System.out.println("Get the url --Chrome Driver");
	}

	@Override
	void getTitle() {
		System.out.println("Ge the Title--Chrome Driver");
		
	}

	@Override
	void findElement() {
		System.out.println("Find the Webelement --chrome Driver");
		
	}

	@Override
	void getText() {
		System.out.println("Get the Text--Chrome Driver");
		
	}

	
	
	
	public void ExplicitWait(){
		System.out.println("set the expilicit timeout--Chrome");
	}

	@Override
	void get() {
		System.out.println("code to launch chrome browser");
		
	}
	
}

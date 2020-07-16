package AbstractClasses;

public class Test {

	public static void main(String[] args) {
		
		ChromeDriver ch= new ChromeDriver();
		//overriding methods
		ch.getText();
		ch.getTitle();
		ch.geturl();
		ch.findElement();
		
		// static method
        Webdriver.close();
        
        // non overridden method final method of parent
        ch.waitTime();
        
        //individual method of chrome class
        ch.ExplicitWait();
        
      System.out.println("----------");
        Webdriver wb = new ChromeDriver();
         // final method of parent
        wb.waitTime();
     // static 
        Webdriver.close();
     
        
        // only overriding methods of child class
        wb.get();
        wb.getText();
        wb.getTitle();
        wb.geturl();
        
        // individual methods of child
      //  wb.ExplicitWait(); // not allowed
     System.out.println("********");
        Firefox f = new Firefox();
        f.getText();
        f.getTitle();
        f.geturl();
        
        
        Webdriver.close();
        f.waitTime();
        
        f.switchToAlert();
        
        
        
        
        
        
	}

}

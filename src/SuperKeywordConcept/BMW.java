package SuperKeywordConcept;

public class BMW extends Car{
	
	public BMW(){
	super();
	//super(5); //Constructor call must be the first statement in a constructor
	System.out.println("BMW constructor");
	//	super(5,10); //constructor call must be the first statement in a constructor
		
	}
	public BMW(int i){
		super(i);
		System.out.println("BMW const");
	}
	
	public BMW(int i, int j){
		super(i,j);
		System.out.println("BMW const");
	}
	
	
	
	
	int max_speed = 200;
String color = "white";

@Override
public void start(){
	System.out.println("start--BMW");
}
	
	public void display(){
		System.out.println(super.max_speed);
		super.start();
		System.out.println(super.color);
	}
	

}

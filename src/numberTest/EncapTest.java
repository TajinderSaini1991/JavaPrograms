package numberTest;

public class EncapTest {

	public static void main(String[] args) {
	Number n = new Number();
	n.setX(12);
	n.setY(14);
	
	System.out.println("The value f x is :"+n.getX());
	System.out.println("The value of y is :" +n.getY());
	
	
	n.setStdName("Smith");
	n.setStdId(102);
	n.setStdRollNo(15);
	
	
	System.out.println("The name of student is: " + n.getStdName());
	System.out.println("The id of student is: " + n.getStdId());
	
	System.out.println("The roll no. of student is: "+ n.getStdRollNo());

	}

}

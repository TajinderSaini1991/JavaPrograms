package Assignments;

public class Loops {

	public static void main(String[] args) {
    for (int i=1;i<=5;i++){
	System.out.println("I am  Batman");
}
for (int j =1;j<10;j++){
	System.out.println("I am  Batman "+j);
}
	
int k = 4; // 10 to 1 using while loop
while(k>=1){
	System.out.print(k +" ");
	k--;
}
System.out.println(" ");
int l=10;// 10 to 1 using do while loop
do{
	System.out.print(l +" ");
	l--;
}
while(l>=1);

System.out.println(" ");
int m=1; //WAP to print "Hello World" ten times using while loop
while (m<=10){
	System.out.println("Hello World");
	m++;
}
	int n =1;  //WAP print 1 to 10 using while loop but quit if multiple of 7 is encountered

while(n<=10){
	System.out.print(n +" ");
	if(n%7==0){
		break;
	}n++;
	
}
System.out.println("\n"+ "*********");
int n1=1;
while(n1<=20){
	if(n1%7!=0){
		System.out.println(n1 +" ");
	}
	n1++;
}

System.out.println("**********");




   //unreachable code (error)
/*while(false){
	System.out.println("unreachable code");
	m++;
}*/
boolean flag = false;
while (flag){
	System.out.println("this code is not unreachable");
	
}
////dead code(warning)
//		if (false){
//		System.out.println("dead code");
//		}
//		else{
//			System.out.println("dead code warning");
//		}
//		
//		if(true){
//			System.out.println("dead code");
//		}
//		else{
//			System.out.println("dead ");
//		}
		
/*while(true){
	System.out.println("abc"); //infinite loop
}*/
		

	}

}

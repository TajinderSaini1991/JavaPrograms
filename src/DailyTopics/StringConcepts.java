package DailyTopics;

public class StringConcepts {

	public static void main(String[] args) {
		
		String str = "Hi this is my java code and I java am so happy" ;
		
		System.out.println(str.length());
		System.out.println(str.charAt(30));
		System.out.println(str.indexOf('s'));
	// 	System.out.println(str.charAt(42)); //exception
		System.out.println(str.indexOf('s', 7)); // 2nd occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); // 2nd occurrence of s
		

		
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("taj"));
		System.out.println(str.indexOf("java",str.indexOf("java")+1));
		System.out.println(str.indexOf("am", str.indexOf("java")+1));
		
		
		String t1= "    hello world    ";
		System.out.println(t1.trim());
		
//		String t2 = "hello world";
//		System.out.println(t2.trim());
		String dob = "01.01.1990";
		System.out.println(dob.replace('.', '/'));
		
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(3));
		
		System.out.println(str.substring(0,7));
		
		String test = "this is my order number 12345";
		System.out.println(test.substring(test.indexOf("number")+7, test.length()));
		System.out.println(test.substring(test.indexOf("number")+7));
		
		String lang = "Java-Python-Ruby-C";
		String langarr[] = lang.split("-");
		for (String i:langarr){
			System.out.println(i);
		}

		String data= "Tom:25:IBM:SFO:98914";
		for(int i =0; i<data.split(":").length;i++){
			System.out.println(data.split(":")[i]);
		}
		
		
	}
}

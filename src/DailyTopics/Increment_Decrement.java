package DailyTopics;

public class Increment_Decrement {

	public static void main(String[] args) {
		int a =10;
		int b = a++;
		System.out.println(a+" "+b);
		
		
		int a1 =-10;
		int b1 = a1++;
		System.out.println(a1+" "+b1);
		
		int c = 5;
		int d = c--;
		System.out.println(c+" "+d);
		
		int c1= -8;
		int d1= c1--;
		System.out.println(c1+" "+d1);
		
		int e = 6;
		int f = ++e;
		System.out.println(e+" "+f);
		
		int e1= -5;
		int f1= ++e1;
		System.out.println(e1+" "+f1);
		
		int g= 9;
		int h=--g;
		System.out.println(g+" "+h);
		
		
		int g1= -9;
		int h1=--g1;
		System.out.println(g1+" "+h1);
		
		int tt = 10;
		//int pp1 = ++tt + 10; //21
		int pp = tt++ + 10;//20
		
		System.out.println(pp);
		
		int u =10;
		int r =++u + --u + u++ ;//11+10+10
		System.out.println(r);
		System.out.println(u);
		
		int i= 10;
		int j = ++i + i++ +i-- ; // 11+11+12=34
		System.out.println(i);
		System.out.println(j);
		
		int k =10;
		int l= k++ + ++k +k-- ;//10+12+12=34; 
		System.out.println(k);
		System.out.println(l);
		
		int m = 10;
		int n = m++ + m-- + ++m ;// 10+11+11=32
		System.out.println(m);// 11,10,11 ==11
		System.out.println(n);
		
		int o= 10;
		int p =++o +--o +o++ +o--;
		System.out.println(o);// 10
		System.out.println(p);// 11+10+10+11= 42
		
		int q= 10;
		int s = q++ + --q + q++ + --q + q++ ;
		System.out.println(q);// 11
		System.out.println(s);// 10+10+10+10+10=50
		
		
		int t= 10;
		int v= ++t + --t + t++ + t-- + t++ ;
		System.out.println(t);// 11,10,11,10,11==11
		System.out.println(v);// 11+10+10+11+10= 52
		
		int w= 10;
		int x= w-- - w++ + ++w + --w - w++ + w-- - ++w;
		System.out.println(w);// 13
		System.out.println(x);// 10-9+11+10-10+11-11=12
		
		int y = 10;
		int z= y++ + y++ + --y + ++y + 10 + --y + y++ + 10;
		System.out.println(y);// 12
		System.out.println(z); // 10+11+11+12+10+11+11+10= 86

		
		
		
	}

}

package DailyTopics;

import java.util.Arrays;

public class Arraya {

	public static void main(String[] args) {

		int number[] = new int[4];
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 8;
		// number[4]=6;
        System.out.println(Arrays.toString(number));
		System.out.println(number[3]);

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i] + " ");
		}
		System.out.println("\n");

		float fl[] = new float[3];
		fl[0] = 1f;
		fl[1] = 10.23f;
		fl[2] = 15.75f;
		System.out.println(fl[2]);
		for (int i = 0; i < fl.length; i++) {
			System.out.println(fl[i] + " ");
		}

		System.out.println("\n");

		double[] d = new double[2];
		d[0] = 23.33;
		d[1] = 56.36;
		System.out.println(d[1]);

		double d1[] = { 12.33, 56.58, 87.57 };
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i] + " ");
		}

		char c[] = { 'a', 'b', 'c', 'd' };

		System.out.println(c[3]);

		char c1[] = new char[5];
		c1[0] = 'e';
		c1[1] = 'f';
		c1[2] = 'h';
		System.out.println(c1[3]);
		System.out.println("\n");

		String s[] = { "sumit", "john", "victoria", "tajinder" };
		
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}
		System.out.println("\n");
		Object arr[] = new Object[3];
		arr[0] = 23;
		arr[1] = "john";
		arr[2] = 45.10;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

		System.out.println("\n");

		Object obj[] = { "john", 56.23, true, 'a', 45f };
		System.out.println(obj[3]);

		boolean b[] = new boolean[2];
		// b[0]= true;
		b[0] = false;
		System.out.println(b[1]);
		System.out.println(b[0]);

	}

}

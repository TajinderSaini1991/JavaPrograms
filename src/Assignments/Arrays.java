package Assignments;

public class Arrays {

	public static void main(String[] args) {

		Object playerA[] = { "Virat", 31, "RCB", " 05.11.1988", 'm', 49.50 };
		Object playerB[] = { "Mitchell ", 38, "M Indians", "02.11.1981", 'm', 41.70 };
		Object playerC[] = { "Williamson", 29, "Sun Hyd", "08.08.1990", 'm', 45.50 };
		Object playerD[] = { "Rashid", 21, "Kings XI", "02.09.1998", 'm', 42.00 };

		for (Object ob : playerA) {

			System.out.print(ob + "  ");
		}
		System.out.println("\n ");
		for (Object ob : playerB) {

			System.out.print(ob + "  ");
		}
		System.out.println("\n ");
		for (Object ob : playerC) {

			System.out.print(ob + "  ");
		}
		System.out.println("\n ");
		for (Object ob : playerD) {

			System.out.print(ob + "  ");
		}
		System.out.println(" ");
		// Write a program to print the following pattern using for loop:
		System.out.println("\n ");
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {

				System.out.print(i + "" + j + " ");

			}
			System.out.println(" ");
		}
 
		System.out.println("\n ");
		 //Try to print the following pattern on the console:
		for (int k = 4; k >= 0; k--) {
			System.out.println("n = " + k);
		}

	}

}

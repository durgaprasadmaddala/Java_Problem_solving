package Day1parctice;

import java.util.Scanner;

public class Biggest3digitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// largest of 3 numbers

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A value");
			int a = sc.nextInt();
			System.out.println("Enter B value");
			int b = sc.nextInt();
			System.out.println("Enter C value");
			int c = sc.nextInt();
			System.out.println("A=" + a + "B=" + b + "C=" + c);

			int largest = a;
			if (b > a) {
				largest = b;
			}
			if (c > a) {
				largest = c;
			}
			System.out.println("Largest number is " + largest);
			break;

		}

	}

}

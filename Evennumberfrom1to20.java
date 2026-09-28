package Day1parctice;

import java.util.Scanner;

public class Evennumberfrom1to20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {

				System.out.println(i);
				System.out.println("Even numbers");
			}
		}
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {

				System.out.println(i);
				System.out.println("odd numbers");
			}
		}

	}

}

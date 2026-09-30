package Day1parctice;

import java.util.Scanner;

public class Countnumbers12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		System.out.println("Your entered value" + n);

		int count = 0;
		for (int i = 1; i <= n; i++) {
			int d = n % 10;
			count++;
		}
		System.out.println(count);
	}

}

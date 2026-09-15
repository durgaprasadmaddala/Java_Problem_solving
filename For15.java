package Loops;

import java.util.*;

public class For15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q3. Reverse a given number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		System.out.println("Your number" + n);

		int rev = 0;

		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;

		}
		System.out.println("Your number is reverrse"+rev);

	}

}

package Loops;

import java.util.Scanner;

public class Forloop14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the sum of digits of a given number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		System.out.println("Your number" + n);

		int sum = 0;

		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println("your sum"+sum);

	}

}

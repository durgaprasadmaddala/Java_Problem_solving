package Loops;

import java.util.Scanner;

public class For20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q8. Find the product of digits of a given number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value");
		int num = sc.nextInt();
		System.out.println("Your number" + num);

		int product = 1;

		while (num != 0) {
			int digit = num % 10;
			product = product * digit;
			num = num / 10;

		}
		System.out.println("The product of given number is " + product);
	}

}

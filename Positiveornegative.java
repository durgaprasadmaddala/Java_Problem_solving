package Day1parctice;

import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given number is +,-
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your given number");
		int n = sc.nextInt();
		System.out.println("Your given number is " + n);
		if (n > 0) {
			System.out.println("Given number is positive");
		}
		if (n < 0) {
			System.out.println("Given number is negative");
		}

	}

}

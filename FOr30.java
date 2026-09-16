package Loops;

import java.util.Scanner;

public class FOr30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		System.out.println("Your number" + num);
		int factorial = 1;
		int rev = 0;
		for (int i = 1; i <= num; i++) {

			factorial = factorial * i;
		}
		System.out.println("Factorial value is " + factorial);

		
	}
}
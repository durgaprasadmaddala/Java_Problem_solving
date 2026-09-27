package Day1parctice;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given number is even or odd

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		System.out.println("your entered value" + n);
		if (n % 2 == 0) {
			System.out.println("Even number" + n);
		} else {
			System.out.println("Odd number" + n);
		}
	}

}

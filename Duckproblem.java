package Date2209practice;

import java.util.Scanner;

public class Duckproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int num=10256;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
int num=sc.nextInt();
		boolean duck = false;
		while (num > 0) {
			if (num % 10 == 0) {
				duck = true;
				break;
			}
			num = num / 10;
		}
		if (duck) {
			System.out.println("Duck number");
		} else {
			System.out.println("not a duck number ");
		}

	}

}

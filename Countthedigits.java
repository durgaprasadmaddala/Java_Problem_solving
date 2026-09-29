package Day1parctice;

import java.util.Scanner;

public class Countthedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		int count = 0;
		for (int i = n; n>i; n = n / 10) {
			int d = n % 10;
			count++;
		}
		System.out.println("count" + count);

	}

}

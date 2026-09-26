package Classtestjava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// palindrome

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number=");
		int n = sc.nextInt();
		System.out.println("Your entered value" + " " + n);
		int org;
		org = n;
		int rev = 0;
		while (n > 0) 
		{
			int d = n % 10;
			rev = (rev * 10) + d;
			n = n / 10;
		}
		if(org==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}

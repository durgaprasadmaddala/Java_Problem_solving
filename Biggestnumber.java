package Classtestjava;

import java.util.Scanner;

public class Biggestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Biggest number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your values A");
		int a = sc.nextInt();
		System.out.println("Enter your values B");
		int b = sc.nextInt();
		System.out.println("Enter your values C");
		int c = sc.nextInt();
		int largest = a;
		
		if (b > largest)
		{
			largest=b;
		}
		if (c > largest)
		{
			largest=c;
		}
		
		System.out.println(largest);

	}

}

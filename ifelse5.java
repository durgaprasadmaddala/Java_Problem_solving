package Ifelsestatements;

import java.util.Scanner;

public class ifelse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("your number" + a);
		// divisinble by 5 or not
		if(a%5==0)
		{
			System.out.println("divisible");
		}
		else
		{
			System.out.println("not divisible");
		}

	}

}

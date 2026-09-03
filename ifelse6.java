package Ifelsestatements;

import java.util.Scanner;

public class ifelse6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("your number" + a);
		
		if(a>=100)
		{
			System.out.println("greater the 100");
		}
		else
		{
			System.out.println("not greater than 100");
		}
	}

}

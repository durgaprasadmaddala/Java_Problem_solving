package Ifelsestatements;

import java.util.Scanner;

public class ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check whether a number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("your number" + a);
		
		if(a%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
		

	}

}

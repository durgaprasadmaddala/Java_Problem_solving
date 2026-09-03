package Ifelsestatements;

import java.util.Scanner;

public class ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to check whether a number is positive or negative
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("your number" + a);
		
		if(a>0) 
		{
			System.out.println("Given number is positive");
		}
		else {
			System.out.println("Given number is negative");
		}

	}

}

package Ifstatements15;

import java.util.Scanner;

public class If14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program to check whether 
		//a student’s marks are greater than or equal to 75.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("your number" + a);
		
		if(a>=75)
		{
			System.out.println("a student’s marks are greater than or equal to 75");
		}

	}

}

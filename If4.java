package Ifstatements15;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to check whether a number is even.
Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your number");
		 int a=sc.nextInt();
		 System.out.println("your number"+a);
		 
		 if(a%2==0)
		 {
			 System.out.println("Your number is even");
		 }
	}

}

package Ifstatements15;

import java.util.Scanner;

public class If6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. Write a Java program to check whether a 
		//person is eligible to vote.
	   // (Age should be 18 or above.)
Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your number");
		 int a=sc.nextInt();
		 System.out.println("your number"+a);
		 
		 if(a>=18)
		 {
			 System.out.println("A person is eligible to vote");
		 }
		 

	}

}

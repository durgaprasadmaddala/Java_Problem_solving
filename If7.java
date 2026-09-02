package Ifstatements15;

import java.util.Scanner;

public class If7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//7. Write a Java program to check whether 
		//a student passed or failed.
	//    (Passing marks = 35.)
Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your number");
		 int a=sc.nextInt();
		 System.out.println("your number"+a);
		 
		 if(a>=35) {
			 System.out.println("a student is passed");
		 }
		 else {
			 System.out.println("a student is failed");
		 }
	}

}

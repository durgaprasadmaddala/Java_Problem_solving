package Ifstatements15;

import java.util.Scanner;

public class If1 {
// given number is positive or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your number");
		 int a=sc.nextInt();
		 System.out.println("your number"+a);
		 
		 if(a>0)
		 {
			 System.out.println("The number is positive");
		 }
		 
	}

}

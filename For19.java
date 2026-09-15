package Loops;

import java.util.Scanner;

public class For19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q7. Check whether a given number is an 
		//Armstrong number (3-digit)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		System.out.println("Your number is "+num);
		
		int org;
		org=num;
		 int sum=0;
		 
		 while(num!=0)
		 {
			 int digit=num%10;
			 sum=sum+(digit*digit*digit);
			 num=num/10;
		 }
		 if(sum==org)
		 {
			 System.out.println("The given number is armstrong");
		 }
		 else {
			 System.out.println("Given number is not a armstrong");
		 }

	}

}

package Loops;

import java.util.Scanner;

public class For17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q5. Find the largest digit in a given number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num =sc.nextInt();
		System.out.println("Your number is "+num);
		 int max=0;
		  while(num!=0)
		  {
			  int digit=num%10;
			  if(digit>max)
			  {
				  max=digit;
				  
			  }
			  num=num/10;
		  }
		  System.out.println("Largest digit"+max);

	}

}

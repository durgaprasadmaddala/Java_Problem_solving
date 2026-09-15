package Loops;

import java.util.Scanner;

public class For16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q4. Check whether a given number is a palindrome

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Your number "+n);
		 int org;
		 org=n;
		  int rev =0;
		  
		  while(n!=0)
		  {
			  int digit =n%10;
			  rev=rev*10+digit;
			  n=n/10;
			  
		  }
		  if(org==rev)
		  {
			 System.out.println("Given number is palandrome"); 
		  }
		  else
		  {
			 System.out.println("Given number is not a palandrome"); 
		  }
	}

}

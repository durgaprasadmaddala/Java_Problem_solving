package Date2209practice;

import java.util.Scanner;

public class Sunnynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter your number");
		  int n=sc.nextInt();
		  System.out.println("Your value is "+n);

	        
	        int x = n + 1;
	        int i = 1;

	        while (i * i < x)
	            i++;

	        if (i * i == x)
	            System.out.println("Sunny Number");
	        else
	            System.out.println("Not Sunny Number");

	}

}

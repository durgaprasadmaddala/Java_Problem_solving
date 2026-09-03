package Ifelsestatements;

import java.util.Scanner;

public class ifelse11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//divisible by both 3 and 5 or not.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("your number");
		int a= sc.nextInt();
		System.out.println("your number");
		
		if(a%3==0 && a%5==0)
		{
			System.out.println("divisible for both 3 and 5");
		}
		else
		{
			System.out.println("Not");
		}
	}

}

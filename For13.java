package Loops;

import java.util.Scanner;

public class For13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q1. Count the number of digits in a given number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=sc.nextInt();
		
		System.out.println("your number is "+num);
		
		int count =0;
		
		while (num!=0)
		{
			count=count+1;// count++
			num=num/10;
		
		}
		System.out.println("your count"+count);

	}

}

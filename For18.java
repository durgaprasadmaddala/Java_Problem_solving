package Loops;

import java.util.Scanner;

public class For18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q6. Find the smallest digit in a given number
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number ");
		int num=sc.nextInt();
		
		System.out.println("Your number is "+num);

		int min=9;
		
		while(num!=0)
		{
			int digit=num%10;
			if(digit<min)
			{
				min=digit;
			}
			num=num/10;
			
		}
		System.out.println("Your smallest number is "+min);

	}

}

package Date2209practice;

import java.util.Scanner;

public class Forloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Neon number
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		System.out.println("Your number"+n);
		
		int squ=n*n;
		int sum=0;
		 
		for(;squ>0;squ=squ/10)
		{
		int digit=squ % 10;
		sum=sum+digit;
		}
		if(sum==n)
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println("Not a neon number");
		}

	}

}

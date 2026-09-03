package Ifelsestatements;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//leap yer
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your year");
		
		int a=sc.nextInt();
		System.out.println("your year"+a);
		
		if(a%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not aleap year");
		}
	}
	

}

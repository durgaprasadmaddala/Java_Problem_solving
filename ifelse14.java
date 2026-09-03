package Ifelsestatements;

import java.util.Scanner;

public class ifelse14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int a=sc.nextInt();
		
		System.out.println("your number"+a);
		
		if(a<10 && a>99 || a<-10 && a<-99)
		{
			System.out.println("your number is two digit number");
		}
		else
		{
			System.out.println("not a two digit number");
		}

		}

}

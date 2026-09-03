package Ifelsestatements;

import java.util.Scanner;

public class Ifelse10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your percentage");
		
		int a=sc.nextInt();
		System.out.println("your percentage");
		
		if(a>=75)
		{
			System.out.println("eligiblity for write a exam");
		}
		else
		{
			System.out.println("not eligible for exam");
		}

	}

}

package Ifstatements15;

import java.util.Scanner;

public class If15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a Java program to
		//check whether a number is both positive and even.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("your number" + a);
		
		if (a>0 && a%2==0)
		{
			System.out.println("A number is both positive and even.");
		}
	}

}

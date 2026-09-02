package Ifstatements15;

import java.util.Scanner;

public class If11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a Java program to check whether a number is greater than 100
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("your number" + a);
		
		if(a>=100) {
			System.out.println("a number is greater than 100");
		}
	}

}

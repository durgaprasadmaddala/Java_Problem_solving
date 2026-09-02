package Ifstatements15;

import java.util.Scanner;

public class If10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rite a Java program
		// to check whether a person’s age is above 60
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		System.out.println("your number" + a);
		
		if(a>=60)
		{
			System.out.println("The person age is above 60");
		}

	}

}

package Ifstatements15;

import java.util.Scanner;

public class If13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to 
		//check whether a given character is lowercase.
		Scanner sc = new Scanner(System.in);				
		System.out.println("Enter your string");
		
		char ch = sc.next().charAt(0);
		System.out.println("your string" + ch);
		
		if(Character.isLowerCase(ch));
		{
			System.out.println("a given character is lowercase");
		}
	}

}

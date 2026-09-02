package Ifstatements15;

import java.util.Scanner;

public class If12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a Java program 
		//to check whether a given character is uppercase.
		Scanner sc = new Scanner(System.in);				
		System.out.println("Enter your string");
		char ch = sc.next().charAt(0);
		System.out.println("your string" + ch);
		
		if(Character.isUpperCase(ch))
		{
			System.out.println("a given character is uppercase");
		}

	}

}

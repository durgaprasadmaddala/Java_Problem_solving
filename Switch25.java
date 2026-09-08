package Ifelsestatements;

import java.util.Scanner;

public class Switch25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 values operators
		System.out.println("welcome to calculator");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a 1 st value");
		int num = sc.nextInt();
		System.out.print("your 1st value"+num);

		System.out.println("Enter a 2nd value");

		int num1 = sc.nextInt();
		System.out.println("your 2nd value"+num1);
		
		System.out.println("Select your operations");
		System.out.println("1. addition +");
		System.out.println("2. subtraction -");
		System.out.println(" 3. multiplication *");
		System.out.println(" 4. division /");
		
		System.out.println("enter your operation number");
		int choice = sc.nextInt();
		System.out.print("your 1st value"+choice);
		System.out.println("your choice number"+choice);
		
		switch(choice) {
		case 1:
			System.out.println("Adding two numbers"+(num+num1));
		break;
		case 2:
			System.out.println("subtraction two numbers"+(num-num1));
		
		break;
		case 3:
			System.out.println("multplication two numbers"+(num*num1));
		break;
		case 4:
			System.out.println("division two numbers"+(num/num1));
			break;
		
		default:
			System.out.println("in valid");
		}
	

}

}

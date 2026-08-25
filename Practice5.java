package Practice;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Multiply two floating point numbers

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you first float value");
		float ff = sc.nextFloat();
		System.out.println("Your float value" + ff);

		System.out.println("Enter you second float value");
		float fff = sc.nextFloat();
		System.out.println("Your 2nd float value" + fff);
		
		float f3=ff*fff;
		System.out.println("Multiply two floating points numbers"+f3);
		

	}

}

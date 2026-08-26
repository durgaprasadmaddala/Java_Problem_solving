package Practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Max value to the given number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a value");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		System.out.println("enter c value");
		int c = sc.nextInt();

		int num=Math.max(Math.max(a, b),c);
		
		System.out.println("Max value"+num);
	}
}

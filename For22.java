package Loops;

import java.util.Scanner;

public class For22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q10. Check whether a given number is a Perfect number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		int num = sc.nextInt();
		System.out.println("Your number is" + num);

		int i = 1;
		int sum = 0;

		while (i < num) {
			if (num % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if(sum==num)
		{
			System.out.println("Given number is perfect");
		}
		else
		{
			System.out.println("Given number is not perfect");
		}

	}

}

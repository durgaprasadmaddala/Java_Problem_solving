package Date2209practice;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// duck number
		// sunny number
		// unique number
		// A Duck Number is a number that contains at
		// least one 0 in it, but the number should not start with 0.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:-");
		int num = sc.nextInt();
		System.out.println("Your number is :-" + num);

		int temp = num;
        boolean isDuck = false;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0) {
                isDuck = true;
                break;
            }

            temp = temp / 10;
        }

        if (isDuck) {
            System.out.println(num + " is a Duck Number");
        } else {
            System.out.println(num + " is not a Duck Number");
        }

        sc.close();
	}
}

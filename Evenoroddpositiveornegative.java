package Day1parctice;

import java.util.Scanner;

public class Evenoroddpositiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your value");
			int n = sc.nextInt();
			System.out.println("Your entered value" + n);

			if (n % 2 == 0 && n > 0) {
				System.out.println("positive even number  " + n);
			}
			if (n % 2 == 0 && n < 0) {
				System.out.println("Negative  even number  " + n);
			}
			if (n % 2 == 1 && n > 0) 
			{
                System.out.println("Positive odd number"+n);
			}
			if(n % 2 ==1 && n<0)
			{
				System.out.println("Negative odd number"+n);
			}
			if(n==0)
			{
				System.out.println("zero");
			}

		}

	}

}

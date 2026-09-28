package Day1parctice;

import java.util.Scanner;

public class Smallestnumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A value");
			int a = sc.nextInt();
			System.out.println("Enter B value");
			int b = sc.nextInt();
			System.out.println("Enter C value");
			int c = sc.nextInt();
			System.out.println("A   " + a + "B   " + b + "C  " + c);

			int smallest = a;
			
			if(a>b)
			{
				smallest=b;
			}
			if(a>c)
			{
				smallest=c;
			}
			System.out.println("Smallest number is  "+smallest);

		}

	}

}

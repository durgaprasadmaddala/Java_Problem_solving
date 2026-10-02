package Day1parctice;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entetr a value");
		int n=sc.nextInt();
		System.out.println("Your entered value"+n);
		int b=1;
		while(b<=205)
		{
			int sum=n*b;
			System.out.println(n+"X"+b+"="+sum);
			b++;
		}
		

	}

}

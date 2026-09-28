package Day1parctice;

import java.util.Scanner;

public class Sumofnaturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of n natural numbers 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number ");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);

	}

}

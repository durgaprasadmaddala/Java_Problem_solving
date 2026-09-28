package Day1parctice;

import java.util.Scanner;

public class Tabes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int sum=n*i;
			System.out.println(n+"X"+i+"="+sum);
		}

	}

}

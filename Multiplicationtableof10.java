package Whileloop;

import java.util.Scanner;

public class Multiplicationtableof10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		System.out.println("Your number"+n);
		
		int i=1;
		while(i<=10)
		{
			System.out.println(n+"x"+i +"="+(n*i));
			i++;
		}

	}

}

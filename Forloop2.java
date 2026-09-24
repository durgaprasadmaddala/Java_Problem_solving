package Date2209practice;

import java.util.Scanner;

public class Forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entetr your value");
		int n=sc.nextInt();
		System.out.println("your number"+n);
		
		int fact=1;
					
		for(int i=1;i<=n;i++) 
			
		{
			fact=fact*i;
			
		}
		
		System.out.println(fact);

	}

}

package Loops;

import java.util.Scanner;

public class For21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Q9. Count how many even and odd digits 
		//are present in a given number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		System.out.println("Your number is "+num);
		
	int evecount=0;
	int oddcount=0;
	while(num!=0)
	{
		int digit=num%10;
		if(digit%2==0)
		{
			evecount++;
		}
		else
		{
			oddcount++;
		}
		num=num/10;
	}
	System.out.println("Even nubers"+evecount);
	System.out.println("odd numbers"+oddcount);

		
	}

}

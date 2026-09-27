package Day1parctice;

import java.util.Scanner;

public class Leapyearornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//leap year or not
		while(true)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your year");
			int n=sc.nextInt();
			System.out.println("Your year is ="+n);
			if(n%400==0 || n % 4==0 && n % 100 !=0)
			{
				System.out.println("Leap year  "+n);
			}
			else
			{
				System.out.println("Not a leap year  "+n);
				
			}
		}
	}

}

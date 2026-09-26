package Classtestjava;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sum of n natural numbers

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number");
		int n = sc.nextInt();
		System.out.println("Your number" + n);
		
		int sum=0;
		int i=0;
		
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);

	}

}

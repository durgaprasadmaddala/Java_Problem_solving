package Practice;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Weathe the given number is even or odd
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value");
		 int num =sc.nextInt();
		 
		 if(num % 2 ==0)
			 
		 {
			 System.out.println("The given number is even");
		 }
		 else {
			 System.out.println("The given number is odd");
		 }
	}

}

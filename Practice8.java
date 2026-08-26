package Practice;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Adding of two complex numbers
		// 5+6i
		// real nnumber+imaginary numbers i
		
		/*int rr=5,image=6;
		int rrr=3,imagee=4;
		
		int real=rr+rrr;
		int imageee=image+imagee;
		
		System.out.println("Sum"+real+"+"+imageee+"i");*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the real number and Imaginary number");
		
		int r=sc.nextInt();
		int im=sc.nextInt();
		System.out.println(r+"+"+im+"i");
		
		System.out.println("Enter the real number and Imaginary number");
		
		int rr=sc.nextInt();
		int imm=sc.nextInt();
		System.out.println(rr+"+"+imm+"i");
		
		System.out.println("Sum of two numbers"+(r+rr)+"+"+(im+imm)+"i");
		
		
		 
		

		

	}

}

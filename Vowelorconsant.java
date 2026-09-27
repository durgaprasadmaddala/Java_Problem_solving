package Day1parctice;

import java.util.Scanner;

public class Vowelorconsant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your string ");
		char ch=sc.next().charAt(0);
						System.out.println("Your String"+ch);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println("Your character is Vowel");
			}
			else {
				System.out.println("Your character is consonants");
			}

		}

	}

}

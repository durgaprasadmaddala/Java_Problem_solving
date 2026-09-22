package Date2209practice;
import java.util.*;

public class Uniquenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		System.out.println("your number is "+n);
		int temp = n;
		boolean unique = true;

		while (temp > 0) {
			int d = temp % 10;
			int x = temp / 10;

			while (x > 0) {
				if (x % 10 == d) {
					unique = false;
					break;
				}
				x /= 10;
			}

			if (!unique)
				break;

			temp /= 10;
		}

		System.out.println(unique ? "Unique Number" : "Not Unique Number");	

	}

}

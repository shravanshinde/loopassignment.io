package Rabish;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		int n;
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number which you want to reverse");
	    n =sc.nextInt();
		while(n!=0) {
			int remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;
			sc.close();
		}
		System.out.print("reversed"+rev);
		}

}

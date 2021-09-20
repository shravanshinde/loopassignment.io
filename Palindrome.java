package Rabish;
import java.util.Scanner;
public class Palindrome {
public static void main(String args[]) {
	String reverse="";
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the text which you want to know whwteher palindrome or not:");
	String s = sc.nextLine();
	
	for(int i=s.length()-1;i>=0;i--) {
		reverse=reverse+s.charAt(i);
		}
	if(s.equals(reverse)) {
		System.out.println("given string is palindrome");
	}else {
		System.out.println("given string is  not palindrome");
	}
	
	
}
}

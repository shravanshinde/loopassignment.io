package Rabish;
import java.util.Scanner;
public class Plindrome2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text which you want to know wether palindrome or not");
		String s=sc.nextLine();
		int i,j,flag;
		i=0;
		j=s.length()-1;
		flag=0;
		while(i<j && flag==0) {
			if(s.charAt(i)!=s.charAt(j))
				flag=1;
			i=i+1;
			j=j-1;
		}
		if(flag==0) {
			System.out.println("the entered text is palindrome");
		}else {
			System.out.println("the entered texr is not palindrome");
		}
			
		
	}

}

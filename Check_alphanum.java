package java_practice;

import java.util.Scanner;

public class Check_alphanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a any string and number");
		String a=sc.nextLine();
		sc.close();
		boolean h=checkalphanum(a);
		
		System.out.println(h);
		
		
		
	}
	public static boolean checkalphanum(String a) {
		if(a.matches("[a-zA-Z0-9]+")) {
			System.out.println("It is an Aplha-numeric String");
			return true;
			
		}
		else {
			System.out.println("It is not an Alphanumeric String");
			return false;
			
		}
		
	}
}
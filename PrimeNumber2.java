package java_practice;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	int i =0;
	int num =0;
	
	String primeNumbers ="";
	System.out.println("Enter the value of N");
	int n =scanner.nextInt();
	scanner.close();
	
	for (i = 1; i <=100; i++) {
		
		int counter=0;
		for(num =i; num>=1; num--) 
		{
			if(i%num==0) {
				
				counter = counter +1;
			}
		}
		if (counter ==2) {
			
			primeNumbers = primeNumbers +i + " ";
		}
		
	}
	System.out.println("prime number from 1 to 100");
	System.out.println(primeNumbers);
	

}

}


package java_practice;

public class Prim_num {
	
	public static void main(String args[]) {
		
		printprime();
		
		
		
	}
	public static void printprime() {
		int i=0;
		int flag=0;
		int j=2;
		System.out.println("The prime numbers btw 15-80 are: ");
		for (i=15;i<=80;i++) {
			if(i==1) {
			}
			else {
				for(j=2;j<i/2;j++) {
					if(i%j==0) {
						flag=0;
						break;
					}
					else {
						flag=1;
					}
				}
				if(flag==1) {
					
					System.out.format("%d"+" ",i);
				}
			}
			
		}
		
	}

}

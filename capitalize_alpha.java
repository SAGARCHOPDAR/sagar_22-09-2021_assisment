package java_practice;

public class capitalize_alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc1@3#xyz";              // INPUT STRING
		
		char[] n=check(str);
		System.out.println(n);            // OUTPUT STRING
		
		
		
	}
	public static char[] check(String s) {
		char[] name=s.toCharArray();
		int i=0;
		for(i=0;i<name.length;i++) {
			if(name[i]>='a' && name[i]<='z') {
				 name[i] = Character.toUpperCase(name[i]);
				 			 			
				
			}
		}
		return(name);
	}




	}



package pattern;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(char i='A';i<='E';i++) {
			
			for(char k='A';k<=('E'-i+65);k++) {
				System.out.print(" ");
			}
			
			for(char j='A';j<=i;j++) {
				
				System.out.print( j+" ");
			}
			
			System.out.println();
		}
	}
}
/***
A 
A B 
A B C 
A B C D 
A B C D E 
 */

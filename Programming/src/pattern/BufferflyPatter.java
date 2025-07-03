package pattern;
/**
 
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 
 
 */
public class BufferflyPatter {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			//print star
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//print space
			for(int k=1;k<=2*n-2*i-1;k++) {
				System.out.print("  ");
			}
			//print star
			for(int j=1;j<=i;j++) {
				if(j<n)
				System.out.print("* ");
			}
			System.out.println();
		}
		//second half
		
		for(int i=n-1;i>=0;i--) {
			//print star
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//print space
			for(int k=1;k<=2*n-2*i-1;k++) {
				System.out.print("  ");
			}
			//print star
			for(int j=1;j<=i;j++) {
				if(j<n)
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

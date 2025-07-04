package pattern;

public class Pattern9 {
	public static void main(String[] args) {
		int n = 5;// outer
		for (int i = 1; i <= n; i++) {
         
			for (int j = 1; j <= n; j++) {
				if(i==j||i+j==n+1 ||j==1||j==n|| i==n/2+1)
				System.out.print(j + " ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}
}

/*
    1       5 
	1 2   4 5 
	1 2 3 4 5 
	1 2   4 5 
	1       5 
 */

package pattern;

public class Pattern3 {
	public static void main(String[] args) {
		
		/*
		 * 	1 
			2 3 
			4 5 6 
			7 8 9 10 
			11 12 13 14 15 
		 */
		
		int x=1;
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x +" ");
				x++;
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		
		/*
		 *  1 
		    2 2 
			3 3 3 
			4 4 4 4 
			5 5 5 5 5 
		 */
		for(int i=1;i<=n;i++) {
			int y=i;
			for(int j=1;j<=i;j++) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		/*
		 *  1 
			2 6 
			3 7 10 
			4 8 11 13 
			5 9 12 14 15 
		 */
		for(int i=1;i<=n;i++) {
			int y=i;
			for(int j=1;j<=i;j++) {
				System.out.print(y+" ");
				y=y+(n-j);
			}
			System.out.println();
		}
	}

}










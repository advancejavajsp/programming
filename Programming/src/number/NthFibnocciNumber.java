package number;

public class NthFibnocciNumber {
	
	public static void main(String[] args) {
        int  i = 0, k = 6;
        int n1=0;
        int n2=1;
        System.out.print("Fibonacci Series: ");
        while(i<k) {
            int n3=n2+n1;
            n1=n2;
            n2=n3;
            		
            i++;		
        }
        System.out.print(n1 + " ");
    }

}

package number;

public class FibonacciSeries {
    public static void main(String[] args) {
    	 int  i = 0;
         int n1=0;
         int n2=1;
         System.out.print("Fibonacci Series: ");
         while(i<10) {
        	 System.out.print(n1 + " ");
             int n3=n2+n1;
             n1=n2;
             n2=n3;
             		
             i++;		
         }
        
     
    }
}

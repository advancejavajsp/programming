package number;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, original = num, result = 0,num2=num,count=0;
        
        while(num2>0) {
        	count++;
        	num2/=10;
        }
        
        while (num > 0) {
            int digit = num % 10;
            int power=1;
            for(int i=1;i<=count;i++) {
            	power=power*digit;
            }
            result += power;
            num /= 10;
        }
        if (result == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }
}


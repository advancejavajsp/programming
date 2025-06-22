package number;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 145, original = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        if (sum == original)
            System.out.println(original + " is a Strong number.");
        else
            System.out.println(original + " is not a Strong number.");
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
}

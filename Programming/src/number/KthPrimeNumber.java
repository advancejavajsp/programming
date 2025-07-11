package number;

public class KthPrimeNumber {

	public static boolean primeChecker(int n) {

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}

		if (count == 2)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		int k = 5;
		int count = 0;
		int num = 1;

		while (count < k) {
			num++;
			if (primeChecker(num)) {
				count++;
			}
			
		}
		System.out.println(num);
	}
}

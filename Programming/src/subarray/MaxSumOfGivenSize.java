package subarray;

public class MaxSumOfGivenSize {

	public static void main(String[] args) {
		int a[] = { 1, 2, 36, 3, 8, 9, 36, 85, 6, 8 };
		int k = 3;

		int windowSum = 0;
		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += a[i];
		}
		maxSum = windowSum;
		for (int i = k; i < a.length; i++) {
			windowSum = windowSum - a[i - k] + a[i];
			if (windowSum > maxSum)
				maxSum = windowSum;
		}
		System.out.println(maxSum);
	}
}

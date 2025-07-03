package subarray;

public class MaxSumInSubArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int max = 1;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {

				sum = sum + a[j];

				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}

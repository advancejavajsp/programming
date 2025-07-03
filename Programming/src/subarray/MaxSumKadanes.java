package subarray;

public class MaxSumKadanes {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int max = a[0];
		int curr = a[0];

		for (int i = 1; i < a.length; i++) {
			if (curr + a[i] > a[i]) {
				curr = curr + a[i];
			} else {
				curr = a[i];
			}
			if (curr > max) {
				max = curr;
			}
		}
		
		System.out.println(max);
	}
}

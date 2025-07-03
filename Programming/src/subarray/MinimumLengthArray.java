package subarray;

/**
 * Given an array of positive integers and a target sum S, find the length of
 * the smallest contiguous subarray whose sum is greater than or equal to S. If
 * no such subarray exists, return 0.
 */
public class MinimumLengthArray{
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 7, 3, 2 };
		int target = 7;
		int result = minSubArrayLen(target, arr);
		System.out.println("Minimum length of subarray: " + result);
	}

	public static int minSubArrayLen(int target, int[] arr) {
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		int windowSum = 0;

		for (int end = 0; end < arr.length; end++) {
			windowSum += arr[end];

			// Shrink the window as small as possible while the window's sum ≥ target
			while (windowSum >= target) {
				int currentLength = end - start + 1;
				if (currentLength < minLength) {
					minLength = currentLength;
				}
				windowSum -= arr[start];
				start++;
			}
		}

		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
}

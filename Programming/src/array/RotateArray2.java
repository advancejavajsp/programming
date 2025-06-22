package array;

public class RotateArray2 {
	public static void main(String[] args) {
		// Rotate Array (Left Rotation by 1)
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int first = arr[0];
		for (int i = 0; i <arr.length - 1; i++)
			arr[i] = arr[i + 1];
		arr[arr.length - 1] = first;
		System.out.println("Rotated Array: " + java.util.Arrays.toString(arr));
	}
}

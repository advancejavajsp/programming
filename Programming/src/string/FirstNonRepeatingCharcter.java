package string;

public class FirstNonRepeatingCharcter{

	public static void main(String[] args) {
		String s1 = "hello world";
		int[] a = new int[256];

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c != ' ')
				a[c]++;
		}

		// Non repeating charcter in same sequence
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (a[c] == 1) {
				System.out.print(c+" first non repeating char");
				break;
			}
		}
	}
}

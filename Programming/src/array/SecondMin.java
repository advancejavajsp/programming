package array;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 15, 7};
        int min = arr[0], second = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                second = min;
                min = num;
            } else if (num < second && num != min) {
                second = num;
            }
        }
        System.out.println("Second Min: " + second);
    }
}


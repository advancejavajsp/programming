package ds;

public class peakelement {

    public static void findPeakElements(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
           

            if (i == 0) {
                
                if (arr[i] > arr[i + 1]) {
                    System.out.println(arr[i]+" "+i);
                }
            } else if (i == n - 1) {
                
                if (arr[i] > arr[i - 1]) {
                	System.out.println(arr[i]+" "+i);
                }
            } else {
                
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                	System.out.println(arr[i]+" "+i);
                }
            }

           
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        findPeakElements(arr);
    }
}


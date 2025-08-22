package array;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 15, 7};
        int min = arr[0];
        for (int num : arr) {//for(int i=0;i<a.length;i++)  num=a[i];
        	        
            if (num < min) min = num;
        }
        System.out.println("Min Element: " + min);
    }
}


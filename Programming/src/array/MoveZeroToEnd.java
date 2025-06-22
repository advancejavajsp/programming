package array;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 3, 0, 5 };
		
		int[] arr1=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr1[k++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}

package array2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

	public static void main(String[] args) {
		int[] a= {3,-8,4,7,3,1,5,9};
		int target=9;
		//sort the array
		Arrays.sort(a);
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			int sum=a[i]+a[j];
			if(target==sum) {
				System.out.println("two sum"+a[i]+" "+a[j]+sum);
				break;
			}
			else if(target>sum) {
				i++;
			}else {
				j--;
			}
		}
	}
	
	public static boolean twoSumUsingHashSet(int[] a,int target) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			int compliment=target-a[i];
			if(set.contains(compliment)) {
				return true;
			}
			else {
				set.add(a[i]);
			}
		}
		
		HashMap map=new HashMap();
		
		return false;
		
	}
}

package array;

public class LinearSearch {

	public static void main(String[] args) {
		
	int[] a=	{ 1, 0, 3, 0, 5 , 1, 0, 3, 0, 5 };
	int k=52;
	int pos=-1;
	for(int i=0;i<a.length;i++) {
		if(a[i]==k) {
			pos=i;
			break;
		}
		
		
	}
	System.out.println("element present at index "+pos);
	}
}

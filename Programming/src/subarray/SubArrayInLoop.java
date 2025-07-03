package subarray;

public class SubArrayInLoop {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		//start
		for(int i=0;i<a.length;i++) {
			//pick end
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					//print from start to end
					System.out.print(a[k]+" ");
					
				}
				
				System.out.println();
			}
		}
	}
}

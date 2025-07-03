package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxOccurence {

	public static void main(String[] args) {
		int [] a= {1,2,1,2,2,2,1,2,3};
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
		int max=0;
		int maxChar = 0;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar);
	}
}

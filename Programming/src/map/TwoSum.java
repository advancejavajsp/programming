package map;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		int target =18;
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			if(map.containsKey(complement)) {
				System.out.print(map.get(complement)+","+i);
				break;
			}else {
				map.put(nums[i], i);
			}
		}
		System.out.println("no");
	}
}

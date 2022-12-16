import java.util.*;

public class Map_sum {
	
	public int [] twosum_hashmap(int[] nums, int target) {
		Map<Integer, Integer> input= new HashMap<Integer,Integer>();
		for (int i=0;i<nums.length;i++) {
			input.put(nums[i],i);
		}
		
		for (int i=0;i<nums.length;i++) {
			int secondNumber=target-nums[i];
			
			if (input.containsKey(secondNumber)) {
				return new int[] {i,input.get(secondNumber)};
			}
		}
		
		return nums;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,7,11,15};
		int target=13;
		
		Map_sum twosum=new Map_sum();
		
		System.out.println(Arrays.toString(twosum.twosum_hashmap(nums,target)));
		
		
	}

}

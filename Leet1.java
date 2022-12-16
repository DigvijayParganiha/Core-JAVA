import java.lang.Math;
public class Leet1 {
	public static void main(String args[]) {
		int z=9;
		
		int[] nums= {2,11,23,4,7,7,5,21};
		int result=nums[0];
		for (int i=0;i<nums.length;i++) {
			int value=Math.abs(nums[i]-z);
			int value1=Math.abs(nums[i+1]-z);
		
			if (nums[i]==z) {
				System.out.println("This is the same number");
			}else if(value>value1) {
				System.out.println("The closest number is "+nums[i+1]);
				
			} else if(value < value1) {
				System.out.println("The closest number is "+nums[i]);
			}
		}
	}

}


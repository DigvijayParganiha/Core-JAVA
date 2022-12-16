import java.util.Arrays;
import java.lang.Math;
public class Leet2 {

	public static void main(String[] args) {
		int z=9;
		
		int [] result=new int[10];
		
		int[] nums= {2,11,23,4,8,5,21};
		Arrays.sort(nums);
		
		for (int i=0;i<nums.length;i++) {
			result[i]= Math.abs(nums[i]-z);
			
			
			
		}
		System.out.println("Result:" +nums[0]);
		
	}
}

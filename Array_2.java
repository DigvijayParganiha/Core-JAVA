class Array_2{

	public static void findmaxandmin(int[] nums){
	
	int max=nums[0];
	int min=nums[0];
	
	for (int i=1; i<nums.length, i++){
		if (nums[i]>max) {
			max=nums[i];
		}
		else if (nums[i]<min){
			min=num[i];
		}
	}
	
	System.out.println("The minimum array element is"+min);
	System.out.println(The maximum array elemetn is "+ max);
	}
	
	public static void main(String[] args){
	
	int nums[]= new int[]{23,45,67,32,3,4,5};
	findmaxandmin();
	}
}
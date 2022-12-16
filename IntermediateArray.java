//Rotate array in java using Intermediate array

public class IntermediateArray {
	
	public static void intermediate_rotate(int arr[],int order)
	{
		if (order>arr.length)
			order=order%arr.length;
		
		int result[]=new int[arr.length];
		
		for (int i=0;i<order;i++)
		{
			result[i]=arr[arr.length-order+i];
		}
		int j=0;
		for (int i=order;i<arr.length;i++)
		{
			result[i]=arr[j];
			j++;
		}
		
	}
	
	public static void print_array(int result[],int order)
	{
		for (int i=0;i<result.length;i++)
		{
			System.out.println(result[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		
		int order=3;
		int result[]=new int[arr.length];
		intermediate_rotate(arr,order);
		
		System.out.println("Rotated array is");
		
		print_array(result,order);

	}

}

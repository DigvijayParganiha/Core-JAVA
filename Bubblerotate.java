
public class Bubblerotate {
	
	public static void rotate(int arr[], int order) {
	
		for (int i=0;i<order;i++)
		{
			for (int j=arr.length-1;j>0;j--)
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
		
	}

	static void printArray(int arr[],int order) 
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7};
		
		int order=1;
		
		rotate(arr,order);
		
		System.out.println("Rotated array: ");
        printArray(arr, order);

	}

}

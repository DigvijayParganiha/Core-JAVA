import java.util.Arrays;

public class Rotation_count {
	static int rotation_count(int arr[],int n) {
		int count=0;
		int z=arr[0];
		int temp;
		for(int i=0;i<n;i++) {
			if (arr[i]<z) {
				temp=arr[i];
				z=arr[i];
				arr[i]=temp;
			}
			count++; 
			
		}
		System.out.println(Arrays.toString(arr));
		return count;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {15,18,2,3,6,12};
		int n=arr.length;
		
		System.out.println(rotation_count(arr,n));
		
		
		
	}

}

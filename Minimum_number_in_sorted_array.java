import java.util.Arrays;

public class Minimum_number_in_sorted_array {
	
	static int minimum_num(int arr[],int n) {
		int min=arr[0];
		int temp;
		for (int j=0;j<n;j++) {
			if (min>arr[j]) {
				min=arr[j];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,1,2,3,4,7};
		int n=arr.length;
		
		
		System.out.println(minimum_num(arr,n));

	}

}

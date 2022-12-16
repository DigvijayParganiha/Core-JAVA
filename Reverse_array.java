
public class Reverse_array {
	
	static void rotate(int arr[], int start, int end) {
		int temp;
		
		while (start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=arr[start];
			start++;
			end--;
			
		}
	}
	public static void print_array(int arr[],int size) {
		
		for (int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		print_array(arr,6);
		rotate(arr,0,5);
		print_array(arr,6);
	}

}

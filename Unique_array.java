
public class Unique_array {
	
	public static void unique(int arr[],int size) {
		
		for(int i=0;i<size-1;i++) {
			
			for (int j=i+1;j<size;j++) {
				if(arr[i]!=arr[j]) {
					System.out.println(arr[j]);
				
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,3,4,5,6,6,7,8,8,2,3,4,11,13,12,9};
		int size=arr.length;
		unique(arr,size);
		
		

	}

}

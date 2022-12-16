
public class Search_array_inside {
	
public static void search(int arr[],int size) {
		
		int temp=arr[0];
		for(int i=1;i<size;i++) {
			 
			 if (arr[i]==temp) {
				 System.out.println("Duplicate Number found"+arr[i]);
				 break;
			 }
			 else {
				 System.out.println("Not found");
			 }
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,4,2,3,4,4,5,6};
		int size=arr.length;
		search(arr,size);
		

	}

}

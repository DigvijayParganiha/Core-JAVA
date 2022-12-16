import java.util.Arrays;
public class Reorder_index {
	
	static int arr[]=new int[] {50,40,70,60,90};
	static int index[]= {3,0,4,1,2};
	
	static void rotate() {
		
		int temp[]=new int[arr.length];
		for (int i=0;i<arr.length;i++) {
			
			temp[index[i]]=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp[i];
			index[i]=i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotate();
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Sorted index");
		System.out.println(Arrays.toString(index));

	}

}

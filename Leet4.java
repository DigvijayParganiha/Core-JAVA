// Java program to find number of
// rotations in a sorted and rotated
// array.
import java.io.*;
import java.lang.*;
import java.util.*;
 
public class Leet4 {
	
	static int countRotations(int arr[], int n)
	{
		int min=arr[0];
		int min_index=0;
		for (int i=0;i<n;i++) {
			if (min>arr[i]) {
				min=arr[i];
				min_index=i;
			}
			
		}
		return min_index;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,13,12,31,2,3,4,5,6};
		int n=arr.length;
		System.out.println(countRotations(arr,n));
}
	
}

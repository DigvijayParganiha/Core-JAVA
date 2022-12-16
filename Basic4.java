import java.util.Scanner;
public class Basic4 {
	
	
	static void checkpali(String input) {
		
		
		boolean result =true;
		
		int length= input.length();
		
		for (int i=0;i<=length/2; i++) {
			
			if (input.charAt(i) !=input.charAt(length-i-1)) {
				result= false;
				break;
			}
		}
				System.out.println(input+ " is palindrome = "+result);
				
	
	}
		

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Statement");
		String str=sc.nextLine();
		
		checkpali(str);
	}
	}	
		
		
		

	


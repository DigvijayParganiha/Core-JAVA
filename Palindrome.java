
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=141;
		int temp=n;
		int sum=0;
		
		while(n>0) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if (temp==sum) {
			System.out.println("Number is palindrome");
			
		}else {
			System.out.println("Its not");
		}
	}

}

import java.util.Scanner;

class Peterson_number{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if (peterson(n)){
		System.out.println(n+"is a peterson number");
		
		}
		else{
		System.out.println(n+"is not a peterson number");
		
		}
	}
	public static boolean peterson(int n){
		int num=n;
		int sum=0;
		
		while(n>0){
		
			int digit=n%10;
			sum =sum + fact(digit);
			n=n/10;
			
		}
		return(sum==num);
	}
	static int fact(int n){
		if (n==1){
		return 1;
		}
		else{
		int z= n*fact(n-1);
		return(z);
		}
	}
	
}


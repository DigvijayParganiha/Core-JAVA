public class Reverse_number{

	public static void main(String[] agrs){
		int z=893456;
		int remainder;
		int reverse;
		
		while (int z!=0){
			remainder=z%10;
			reverse=reverse*10+remainder;
			z=z/10;
			
		}
		System.out.println("The reverse of the given number is"+reverse);
	}
}
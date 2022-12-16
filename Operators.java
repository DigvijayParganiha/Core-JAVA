
import java.util.*;

public class Operators {
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Three Number");
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		System.out.println("You have Entered these numbers"+a +b +c);
			if ((a>b) && (a>c)) {
				System.out.println("a is greater");
			} else if ((b>c) && (b>a)) {
					System.out.println("b is greater");
			} else {
				   System.out.println("c is greater");
				}
	}
}



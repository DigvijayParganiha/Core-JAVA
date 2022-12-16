import java.util.Scanner;
public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1= new Scanner(System.in);
		System.out.print("Enter two numbers:");
		double first =input1.nextDouble();
		double second= input1.nextDouble();
		System.out.println("Enter the operator(+,-,*,/)");
		
		char operator=input1.next().charAt(0);
		
		double result;
		
		switch (operator)
		
		{
			case '+':
				result =first +second;
			break;
			case '-':
				result =first-second;
			break;
			case '*':
				result = first*second;
			break;
			case '/':
				result = first/second;
			break;
			default:
				System.out.print("Error! operator is not correct");
				return;
		}
			System.out.printf("%.1f %c %.1f=%.1f", first, operator,second, result);
			
		}
	}



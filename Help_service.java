/*Class helper service
method foramt number.
method overloading (int double & float)
tell format of each datatype */

public class Help_service{
	
	public  int format_number(int x){
		return x;
	}
	public float format_number(float y){
		return y;
	}
	public double format_double(double z){
		return z;
	}
	public static void main(String[] args){
		int mynum1=format_number(5);
		float mynum2=format_number(32.32);
		double mynum3=format_number(-343.43);
		System.out.println("The integer number is"+mynum1);
		System.out.println("The float number is"+mynum2);
		System.out.println("The double number is"+mynum3);
	}
}
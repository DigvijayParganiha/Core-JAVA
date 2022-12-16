/*Create a class bicycle.
inside a method info
if cycle odd number of gear break on.
even number of gear break off.
gear=number*/

public class Bicycle{
	int gear;
	boolean numb;
	public void info(int gear,boolean numb){
	System.out.println("gearis" + gear + "break is" + numb);
	
	}
	public static void main(String[] args){
	Bicycle bicycle1= new Bicycle();
	bicycle1.info(5,true);
	
	}
}
	

/*create a class lamp.
 Inside two method named turnon and trunoff
 When called turn on input=true
 when turn off input=false*/
 
 
 public class Lamp{
	boolean plug=true;

		public void turnon(){
		System.out.println("Are lights on"+plug);
		
	}
		public void turnoff(){
			plug=false;
			System.out.println("Are lights off"+plug);
	}
	public static void main(String[] args){
	Lamp lamp1=new Lamp();
	lamp1.turnon();
	lamp1.turnoff();
	}
	
}		
		
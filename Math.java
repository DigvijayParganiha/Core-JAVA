/* Class math x and y
solution
4 subclasses additon subration float 3multiplication float 4divide2
solution 5
method overloading*/

class Math{
	int x=3;
	int y=4;
	
	public void mymath(){
	System.out.println("this is solution" );
	}
	
	public static void main(String[] args){
	Math math1=new Math();
	Addition add=new Addition();
	Substraction sub=new Substraction();
	Multiplication mult=new Multiplication();
	Divide div=new Divide();
	math1.mymath();
	add.mymath();
	sub.mymath();
	mult.mymath();
	div.mymath();	
	}	
}
	class Addition extends Math{
		public void mymath(){
		int c;
		c=x+y;
		System.out.println("The addition is "+c);
		}
	}
	class Substraction extends Math{
		public  void mymath(){
		float d=3.20f;
		float e=4.30f;
		float f;
		f=x+y+d+e;
		System.out.println("The substraction is "+f);
		
		}
	}
	class Multiplication extends Math{
		public  void mymath(){
		float g=5.60f;
		float h;

		h=x*y*g;
		System.out.println("The multiplication is"+h);
		}
	}
	class Divide extends Math{
		public void mymath(){
		int k=x/y;
		System.out.println("The division is "+k);
		}
	}
		


	
	

		
		
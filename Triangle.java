/*Write a program to print the area and perimeter of a triangle 
having sides of 3, 4 and 5 units by creating a class named 
'Triangle' without any parameter in its constructor.*/

class Triangle{
	int a=3;
	int b= 4;
	int c=5;
	int area;
	public int Triangle(){
	area=a*b*c;
	return area;
	
	}
	
	
	public static void main(String[] args){
	Triangle t=new Triangle();
	
	System.out.println(t.area);
	}
}

/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
First method named as 'setDim' takes length and breadth of rectangle as parameters and
 the second method named as 'getArea' returns the area of the rectangle. Length and breadth
 of rectangle are entered through keyboard.*/
 
public class Area{
	float length, breadth;
	
	public void setDim( float length, float breadth){
	
	}
	public float getArea(){
	
	float Area=length*breadth;
	return Area;
	}
	
	public static void main(String[] args){
	Area area1=new Area();
	area1.setDim(5,10);
	area1.getArea();
	
	}
	


}

/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
 Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/
 
 public class Student{
	String name="John";
	int roll_no=2;
	

		public static void main(String[] args){
		Student obj1= new Student();
		
		System.out.println("the Student is"+obj1.name);
		System.out.println("The roll number is"+obj1.roll_no);
		}
 }

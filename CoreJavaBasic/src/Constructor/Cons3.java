package Constructor;

//Default constructor written by JVM
public class Cons3 {
	
	int age=22;
	double salary=450000;
	
	/*
	 *  below is default constructor, that will be written by java compiler at compile time
	 Cons3()
	 {
	   Empty body
	 }
	 */

	public static void main(String[] args) 
	{
       Cons3 h=new Cons3();
       System.out.println("Age="+h.age);
       System.out.println("Salary"+h.salary);

	}

}


//When programmer do not write any constructor in program then , Java compiler will write one default constructor with empty body in the program

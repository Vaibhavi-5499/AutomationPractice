package Constructor;

//Constructor program
public class Cons1 
{
   int salary=900000; //nonstatic global variable
   static float margin=5.5f; //static global variable
   
   //default constructor
   Cons1()
   {
	   System.out.println("Inside Default constrctor");
   }
 
   public static void main(String args[])
   {
	 Cons1 c=new Cons1();
	 
	 System.out.println("Your salary is ="+c.salary);
	 System.out.println("The Margin="+Cons1.margin);
	 
   }
	

}



/**
constuctor is used to initilize instance members of the class, Contructor is similar to method but,
	1. constuctor name should be same as classname
	2. constuctor doesn't have return type and also not returns any value
	3. constuctor gets called automatically when an instance/object of a class is created
	4. being a programmer we can't call/executed constuctor based on our requirement
	5. constuctor are 2 types
		a. default constuctor : written by java compiler with empty body
		b. user defined constuctor : written by programmer
			i. zero parameterized constuctor
			ii. parameterized constuctor		
*/

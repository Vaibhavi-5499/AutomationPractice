package Constructor;

//Constrctor Overloading
public class Cons2 {
	
	Cons2()
	{
		System.out.println("This is zero parameterized constructor");
	}
	
	Cons2(char a)
	{
		System.out.println("This is single parameterized constructor");	
	}
	
	Cons2(int a,int b)
	{
		System.out.println("This is int-int parameterized constructor");
	}
	
	Cons2(double a,int b)
	{
		System.out.println("This is Double-int parameterized constructor");
	}
	

	public static void main(String[] args) 
	{
	  Cons2 d=new Cons2();
	  Cons2 d1=new Cons2('R');
	  Cons2 d2=new Cons2(20,30);
	  Cons2 d3=new Cons2(20.9f,70);
     
	}

}



/**
 * Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */

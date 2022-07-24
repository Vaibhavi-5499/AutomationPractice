package Inheritance;


interface drawable
{
	   int Marks=4089; //By Default public static final
       void draw();  //By default public final
}

//class1 inheriting the interface
class circle implements drawable
{

	public void draw()
	{
		System.out.println("Drawing circle");
	}
}

//class1 inheriting the interface
class triangle implements drawable
{
    public void draw()
    {
    	System.out.println("Drawing Triangle");
    }
}

 class Interface1
{
   public static void main(String args[])
   {
	   //IMPLEMENTING INTERFACE 
	   
	   System.out.println("Value of salary :"+drawable.Marks);
	   
	   //creating class1 object
	   circle c=new circle();
	   c.draw(); //Drawing circle
	   
	   //creating class2 object
	   triangle t=new triangle();
	   t.draw();//Drawing Triangle
	   
	   //creating Instance of Interface and passing object of class1
	   drawable d=new circle();
	   d.draw();//Drawing circle
	   
	   
	   
   }
   
}
 
 
 
 

/**
 * Interface--> used to achieve abstraction in java
 * 			--> as we know java doesn't support mutliple inheritance using classes to overcome this 
 * 				java provides interface to support this 
 * 			--> its 100% abstract, no non-abstract method
 * 			--> inside interface will have-(no constractor)
 * 					- variable ---> by default--->public static final
 * 					- methods  ---> by default--->public abstract
 * 			--> wheneven a sub class inherits the interface they use implements keyword
 * 				class childclass implements interfacename{
 * 
 * 				}
 * 			--> As we are not allowed to create an instance of abstract class similarly we are not allowed to create
 * 				instance of interface(because its also incomplete)
 * 			--> when a interface is getting inherited by a sub class, dn there will a contract between these classes thats
 *  			subclass needs to override all the abstract method of interface otherwise subclass becomes abstract class
 * 			--> between 
 * 					1. two classes we use 'extends'
 * 					2. two interface we use 'extends' 
 * 					3. class and interface use 'implements' 
 */







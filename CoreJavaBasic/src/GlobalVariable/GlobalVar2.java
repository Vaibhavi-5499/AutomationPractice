package GlobalVariable;

class GlobalVar2
{
	//Static Global Variable
	
	static int Salary=800000; //static global variable or class variable
	
     public static void main(String args[])
     {
    	//two ways to access static global variable.
    	 
    	 //Accessing SGV using ClassName. Syntax: ClassName.SGVName
    	 System.out.println("Standard way to access SGV: Salary="+GlobalVar2.Salary);
    	 
    	 //Accessing SGV directly inside Static method
    	 System.out.println("Direct way to access SGV: Salary="+Salary);
    	
     }
}

/*
 * Global Variable : A Variable declared outside the method but present inside the class body known as Global variable.
   
   Types of Global variable are Static Global variable and Non-Static Global variable.
   
   a.Static Global Variable or Class variable:
   
         1.Declared with 'static' keyword.
         2.Known as class variable or class member.
         3.loaded in memory at compile time because they are class member.
         4.Can be access using className or directly inside another static method.
           Syntax:classname.StaticVariableName
         5. For static variable memory allocation happens only once. 
         
          
 
 */

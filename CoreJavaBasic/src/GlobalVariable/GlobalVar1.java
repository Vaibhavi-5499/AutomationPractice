package GlobalVariable;

class GlobalVar1
{
	int EmpId=178345; //Non Static global variable or instance variable
	
	static double salary=235.78975; //Static global variable or class variable.
			
    public static void main(String args[])
    {
        int age=5; //Local variable
      
        System.out.println("Local variable: Age="+age);
        
        //way to access Non Static Global Variable
        GlobalVar1 G=new GlobalVar1(); //Creating object of class in which Non Static Global variable is present.
        
        System.out.println("Non Static Global Variable: EmpId= "+G.EmpId); // Using ClassObject.NonStaticGlobalVariableName
        
        //2 ways to access Static global variable
        
        System.out.println("Static Global Variable Salary="+salary);//can be accessed Directly in static method
        
        System.out.println("Static Global Variable Salary="+GlobalVar1.salary);//Using Classname.StaticGlobalVariableName
        
    }
}


/**
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 		a. static global variable or class variable -----> always contains static keyword
 *      b. non-static global variable or instance variable -----> doesn't contains static keyword
 */
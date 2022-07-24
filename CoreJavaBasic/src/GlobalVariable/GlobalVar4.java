package GlobalVariable;

public class GlobalVar4 {
	
	//PROGRAM FOR 2 WAYS TO ACCESS STATIC GLOBAL VARIABLE
	
	//Global Variable
    static int empId=123; //static global variable or class variable  
    
	public static void main(String[] args) 
	{
	int age =30,empID=800; //local variable	
		System.out.println("Local Variable: Age:"+age); //30
        
		age =45;
		System.out.println("Updated Local variable Age:"+age); //45
		
		// Accessing static global variable directly inside static method but here value 800 will be printed
		//When SGV and local variable have similar name then while accessing directly value of local variable will be printed as preference is given to local variable in such cases
		
		System.out.println("Emp ID: "+empID); //800
		
		//Accessing static Global variable using statndard way .i.e. classname.StaticGlobalVariableName
		System.out.println("Emp ID:"+GlobalVar4.empId); //123
		
		
	}

}

/**
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 	a.static global variable or class variable:
		1. declared with static keywords
		2. class variable or class member
		3. loaded in the memory at compile time because they are class member
		4. can be access using classname or directly inside another static method
				classname.staticvariablename
		5. for static member memory location happens only once  
 */

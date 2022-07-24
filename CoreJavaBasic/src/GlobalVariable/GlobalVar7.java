package GlobalVariable;

//PPRGRAM FOR NON STATIC GLOBAL VARIABLE

class GlobalVar7
{
	float Credscore=68.99f ;//Non Static Global Varibale
		
	public static void main(String args[])
	{
		//Creating object of class for aceessing NSG Variable
		GlobalVar7 G=new GlobalVar7();
		
		//Syntax: objectname.NGVar_Name
		
		System.out.println("Credit Score="+G.Credscore);
		
	}

}



/**
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 	a.non-static global variable or instance variable:
		1. declared without static keywords
		2. known as instance/object member
		3. loaded in the memory at run time because they are instance/object member which are created at runtime
		4. create an instance: 
				classname referencevariable;        // no object created
				referencevariable = new className();// object created
							//or
				classname  referenacevariable = new classname();
		5. to access them you need to use 
				referenacevariable.nonstaticvariablename;
				//or you can access nonstaticvariable directly from another nonstatic method
		5. for non-static member memory location happens multiple times based on object creation 
 */
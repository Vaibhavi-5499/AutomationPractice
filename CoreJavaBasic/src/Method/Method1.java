package Method;

public class Method1 {

	public static void main(String[] args) {
	
	//Static menthod can be called directly inside another static method	
	Cal();	
		
    int g=Task(70);//the Function Task will return value of b which will be stored in var G
    System.out.println("Value of G ="+g);
	
   
    
  //Object creation for calling Non static method
    Method1 M=new Method1();
    M.oper(50,70);
    
    
    
    int a=M.Val();//the Function Task will return value of b which will be stored in var G
    System.out.println("Value of a ="+a);
	}
	
	
	

/*
 * accessmodifier:
 * non-accessmodifier:
 * return type:
 * methodName:
 * argument/parameter:
 * return value:
 */

//Method without return type and without arguments
	
	public static void Cal()
	{
		int a=50;
		int G=70;
		
		System.out.println("Value of A="+a);
		System.out.println("Value of G="+G);
		
		 System.out.println("_________________________________________________________");
	}
	
 
  
//method with argument with return type
private static int Task(int a)
{
int b=50;	
System.out.println("Value of A ="+a);	
return b;

}

  //Method with arguments without return type

  void oper(int A,int G)
  {
	  
	  System.out.println("Value of A="+A);
	  System.out.println("Value of G="+G);
  }
  
  //Method without arguments with return type
  
  public int val()
  {
	  int a=50;
	  int G=70;
	  
	   System.out.println("Value of G="+G); 
	   
	   return a;
	   
  }


}


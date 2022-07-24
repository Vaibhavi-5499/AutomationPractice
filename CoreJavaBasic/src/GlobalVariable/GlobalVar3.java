package GlobalVariable;

public class GlobalVar3 {
     //Static Global Variable
	   static  int Marks=300;
	
	public static void main(String[] args) 
	{
      
		//local variables
		int Div=5, Marks=40;
		
		System.out.println("Printing Local Variable :Div="+Div); 
		
		//Value of local variable will be printed
		System.out.println("Printing Global variable using Direct Method: Marks="+Marks); //40
		
		//Value of Global variable will be printed
		System.out.println("Printing Global Variable using standard Method: Marks="+GlobalVar3.Marks); //300
		

	}

}
/*
 * When Static Global variable and Local variable have similar Name,
 * Then while using Direct access method , Preference is given to local variable
 * and Values of local variable is printed as result in output
 * */

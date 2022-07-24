package GlobalVariable;

//Updating value of Non Staic Global Variable using one object and accessing value using 2 diff objects

public class GlobalVar9 {
  float Credscore=40.29f; //Nonstatic global variable
	public static void main(String[] args) 
	{
     GlobalVar9 G1 =new GlobalVar9(); //object1
     
     
    System.out.println("Credit Score:"+G1.Credscore); //40.29
    
    G1.Credscore=80.90f; //Updating value of Non static global Variable
    System.out.println("Value of Cred Score using object G1:"+G1.Credscore); //80.90
    
    GlobalVar9 G2=new GlobalVar9(); //object2
    System.out.println("Value of Cred Score using object G2:"+G2.Credscore);//40.29
    //Here updated value of credit score will not be printed as that value was updated using object G1, and we are using object G2 for accessing this value
    

	}

}

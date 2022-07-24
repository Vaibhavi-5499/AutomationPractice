package GlobalVariable;

//Updating value of Non Staic Global Variable

public class GlobalVar8 {
  float Credscore=40.29f; //Nonstatic global variable
	public static void main(String[] args) 
	{
     GlobalVar8 G =new GlobalVar8();
     
     
    System.out.println("Credit Score:"+G.Credscore);
    
    G.Credscore=80.90f; //Updating value of Non static global Variable
    
    System.out.println("Updated Credit score:"+G.Credscore);

	}

}

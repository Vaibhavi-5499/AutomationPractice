package GlobalVariable;

public class GlobalVar5 {
	
	static int price=500; //SGV
    static int Loan=10;
	public static void main(String[] args) {
		
		//PROGRAM FOR UPDATING VALUE OF STATIC GLOBAL VARIABLE AND LOCAL VARIABLE
		
		//declaring local variable same as SG Variable name.
		int price=300;
		
		//Printing values
		//Direct way to access (Here local var will be accessed as local and SGV have same variable name, so local  var got preference)
		System.out.println("Local PRICE:"+price); //300
		
		//Standard way to access
		System.out.println("Global PRICE:"+GlobalVar5.price); //500
		
		//Updating Local Var value
		price=400;
		System.out.println("Local UPDATED PRICE:"+price); //400
		
		//Updating SG Var value
		GlobalVar5.price=600;
		System.out.println("Global UPDATED PRICE:"+GlobalVar5.price);//600
		
		//Accessing SGV with unique name 
		System.out.println("Global Loan:"+GlobalVar5.Loan);//10
		//Updating value of SGV directly as name is unique 
		Loan=20;
		System.out.println("Global UPDATED Loan:"+Loan);//direct way
		System.out.println("Global UPDATED Loan:"+GlobalVar5.Loan);//standard way
		

	}

}

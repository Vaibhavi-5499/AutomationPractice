package Inheritance;

//Implementing Interface

interface Bank
{
   float ROI(); //By default public abstract	
}

class SBI implements Bank
{
   public float ROI()
   {
	   return 50.30f;
   }
}

class HDFC implements Bank
{
   	public float ROI()
   	{
   		return 90.80f;
   	}
}

public class Interface2 {

	public static void main(String[] args) {
		
		SBI s =new SBI();
		System.out.println("SBI Rate of Interest:"+s.ROI()); //50.30
		
		HDFC h=new HDFC();
		System.out.println("HDFC Rate of Interest:"+h.ROI());//90.80

		Bank B=new HDFC();
		System.out.println("Rate of interest of HDFC:"+B.ROI());//90.80
	}

}

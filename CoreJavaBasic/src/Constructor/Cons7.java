package Constructor;

class c
{
float g=9.8f;

   c(float y)
   {
	   g=y;
   }
}



public class Cons7 {

	public static void main(String[] args) 
	{
	   c w1=new c(1.1f);
	   System.out.println("value of var g using cons object w1="+w1.g);
	   
	   c w2=new c(8.9f);
	  System.out.println("value of var g using cons object w2="+w2.g);		   

	}

}

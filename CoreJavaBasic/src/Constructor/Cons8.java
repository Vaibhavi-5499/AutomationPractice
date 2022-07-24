package Constructor;


class B
{
	int i=90;
  B()
  {
	  System.out.println("Running Class B constructor");
	  
	  i=23;
  }
  
}

class Cons8
{
  public static void main(String[] args)
  {
	  System.out.println("Main() of class Cons8 is started...");
	  
	  B b1=new B();
	  System.out.println("value of B is="+b1.i);
	  
	  b1.i=100;
	  System.out.println("Updated value of B is ="+b1.i);
	  
	  //Since value of var i is updated using object b1, value printed using object b2 will not be affected , it will show original value of i
	  B b2=new B();
	  System.out.println("value of B is="+b2.i);
	  
  }

}
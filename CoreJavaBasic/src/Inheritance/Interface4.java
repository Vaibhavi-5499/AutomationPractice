package Inheritance;

//using same method name in both interfaces

interface printable
{
void print();	
}

interface showable
{
void print();	
}

public class Interface4 implements printable,showable
{
  public void print()
  {
	  System.out.println("This is PRINT method");
  }
	
	public static void main(String[] args)
	{
		Interface4 i=new Interface4();
		i.print();
		

	}

}

package Inheritance;

interface printable
{
   int age =40;
   void print();

}

interface showable
{
   void show();	
}


public class Interface3 implements printable,showable
{
	public static int age=50;
	public void print()
	{
	 System.out.println("Hello, Print");
	}
 
    public void show()
    {
    System.out.println("Hello, Show");	
    }
	
	public static void main(String[] args) 
	{
	Interface3 obj=new Interface3();	
	obj.print();
	obj.show();
	System.out.println("Age:"+printable.age);
	System.out.println("Age:"+Interface3.age);
      
	}

}

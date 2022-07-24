package Constructor;

class x
{
int i;

   x()
   {
	   System.out.println("Inside class X constructor");
	   i=20;
   }
   
   void display()
   {
	   System.out.println("Inside dispay method of class x");
   }
}


class y
{
int j=40;

   y()
   {
	   System.out.println("Inside class Y constructor");
	  
   }
   
   void display()
   {
	   System.out.println("Inside dispay method of class Y");
   }
}

public class Cons6 {
	int d=56;
	void display()
	{
		System.out.println("This is display method of class Cons6");
	}
    public static void main(String[] args) 
    {
	
    	x x=new x();
    	x.display();
    	System.out.println("Global variable of class x="+x.i);
    	
    	y y=new y();
    	y.display();
    	System.out.println("Global variable of class y="+y.j);
    	
        Cons6 k=new Cons6();
        k.display();
        System.out.println("Global variable of class Cons6="+k.d);
        
	}

}

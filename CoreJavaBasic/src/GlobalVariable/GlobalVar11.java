package GlobalVariable;

//PROGRAM ON static and non static variable

public class GlobalVar11 {
	
	static int Role=67;
	static float pointer=9.8f;
	
	char grade='A';
	double credit=6789046;

	public static void main(String[] args) 
	{
	//accessing static global variable
		
		System.out.println("Role="+Role);//direct way
		System.out.println("Pointer="+GlobalVar11.pointer);//standard way

	//accessing Non static Global Variable
		GlobalVar11 H=new GlobalVar11();
		System.out.println("Grade="+H.grade);
		System.out.println("Credit="+H.credit);
		
		System.out.println("*******UPDATED VALUES************");
		//updating Values
		
		Role=70;
		pointer=4.9f;
		
		H.grade='B';
		H.pointer=799.9f;
		
		System.out.println("Role="+Role);//direct way
		System.out.println("Pointer="+GlobalVar11.pointer);//standard way
		
		System.out.println("Grade="+H.grade);
		System.out.println("Credit="+H.credit);
		
		
	}
}
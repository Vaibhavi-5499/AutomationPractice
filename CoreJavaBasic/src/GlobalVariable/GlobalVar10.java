package GlobalVariable;

//Program for static global variable and Non static global variable
public class GlobalVar10 {
	static int Age =90;
	       int salary=700000;

	public static void main(String[] args) {

		//accessing static global variable
		System.out.println("Accessing SGV using direct method="+Age);
		System.out.println("Accessing Statuc global variable using standard method="+GlobalVar10.Age);//classname.SGVarName
		
		//accessing Non Static global variable
		GlobalVar10 GV=new GlobalVar10();//object creation
		System.out.println("Accessing Non static global variable"+GV.salary);

	}

}

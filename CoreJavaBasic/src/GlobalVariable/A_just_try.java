package GlobalVariable;

class GlobalVariable6 {
	//Global Variable
	static int empId=123;//static global variable or class variable
	
	public static void main(String[] args) {
		int age=30;//local Variable
		System.out.println("Local Variable, Age: "+age);//
		age=45;
		System.out.println("Updated, Local Variable, Age: "+age);//
		System.out.println("Direct way to access SGV, EmpID: "+empId);//
		System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable6.empId);//	
		empId=456;
		System.out.println("updated, Direct way to access SGV, EmpID: "+empId);//
		System.out.println("updated, Standard way to access SGV, EmpID: "+GlobalVariable6.empId);//	
	}
}

package GlobalVariable;

public class GlobalVariable11 {
	//Global Variable ---> static & non-static global variable
		static int rollNum=456;
		static boolean result;
		
		double payment=4500.56;
		char grade;
		public static void main(String[] args) {
			System.out.println("Program starts..");
			//access static & non-static global variable
			System.out.println("SGV rollNum: "+rollNum);
			System.out.println("SGV result: "+result);
			
			GlobalVariable11 g1 = new GlobalVariable11();
			System.out.println("NSGV payment: "+g1.payment);
			System.out.println("NSGV grade: "+g1.grade);
			//update the value of static & non-static global variable
			rollNum=500;
			result=true;
			
			g1.payment=54220.56;
			g1.grade='A';		
			//access the updated value of static & non-static global variable
			System.out.println("updated, SGV rollNum: "+rollNum);
			System.out.println("updated, SGV result: "+result);
			System.out.println("updated, NSGV payment: "+g1.payment);
			System.out.println("updated, NSGV grade: "+g1.grade);
			System.out.println("Program ends..");
	}

}

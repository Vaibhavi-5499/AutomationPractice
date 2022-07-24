package Variable;

public class Variable10 {

	public static void main(String[] args) {
		
		/*ideal Ans= (22/7)*100
		              3.14*100=314  
		
		but this will give ans 300 because 
		             (22/7)*100
		                  3*100=300
	(22/7 =3.14 but when 2 whole no are divided it will give ans whole no so here it took 22/7=3)	                  
	
    (so for getting exact decimal ans take one number in decimal value for division)		             
		
		*/
		int pie=0;
		pie=(22/7)*10*10;
        System.out.println("Value of Pie:"+pie);
        
        System.out.println("-----------------------------------------------------");
        
        float pie1=0;
		pie1=(22.0f/7)*10*10;
        System.out.println("Value of Pie:"+pie1);    
        
        System.out.println("-----------------------------------------------------");
        
        



	}

}

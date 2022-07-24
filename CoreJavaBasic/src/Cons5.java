

public class Cons5 {
	
	int amount;
	float loan;
	
	void display()
	{
		System.out.println(amount+" "+loan);
	}
	
	Cons5(int amount,float loan)
	{
		this.amount=amount;
		this.loan=loan;
	}
	

	public static void main(String[] args)
	{
		Cons5 b=new Cons5(59,50000000f);
		b.display();

	}

}

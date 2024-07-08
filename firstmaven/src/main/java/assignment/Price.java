package assignment;

public class Price {
	
	static int amount;
	static double bill;
	
	public static void total(int item1, int item2, int item3)
	{
		amount=item1+item2+item3;
	
	}
	
	public static void discount()
	{
		if(amount>5000)
		{
			bill=amount*0.2;
			System.out.println("TOTAL AMOUNT: "+amount);
			System.out.println("Your discounted amount to be paid: "+bill);
		}
		else
		{
			System.out.println("TOTAL AMOUNT: "+amount);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Price.total(236,450,300);
		Price.discount();
		
		Price.total(2236,4450,1300);
		Price.discount();

	}

}

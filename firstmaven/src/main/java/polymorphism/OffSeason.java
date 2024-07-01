package polymorphism;

public class OffSeason extends OnSeason{
	
	double price;
	
	public OffSeason(double price)
	{
		this.price=price;
	}
	
	public void discount()
	{
		super.discount();
		price=price-(price*0.15);
		System.out.println("The discount price on offs season is: "+price);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffSeason call=new OffSeason(45.8);
		call.discount();

	}

}

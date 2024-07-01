package polymorphism;

public class OnSeason {
	
	double rate;
	
	public void discount()
	{
		rate=rate-(rate*0.04);
		
		System.out.println("The price during On season is: "+rate);
		
	}
	
	public OnSeason(double price)
	{
		this.rate=price;
	}
	
	
	
	

}

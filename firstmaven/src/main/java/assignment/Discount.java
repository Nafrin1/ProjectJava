package assignment;

public class Discount {
	static double pay;
	
	public static void disc(int bill)
	{
		if(bill>5000)
			
		{
			pay=bill*0.2;
			System.out.println("Your discounted amount to be paid is: "+pay);
		}
		else
		{
			System.out.println("Your bill is: "+bill);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount.disc(2000);
		Discount.disc(6000);

	}

}

package encapsulation;

import java.util.Scanner;

public class ClassA1 {
	private int pin1;
	
	public void show()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your pin");
		pin1=scan.nextInt();	
	}
	
	public void getter()
	{
		if(pin1!=0)
		{
		System.out.println("PIN: "+pin1);
		}
		else
		{
			System.out.println("Invalid PIN");
		}
		
	}

}

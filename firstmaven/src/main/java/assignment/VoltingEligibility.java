package assignment;

//import java.util.Scanner;

public class VoltingEligibility {
	
	//static int age;
	//static boolean vote=true;
	
	public static void eligible(int age)
	{
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		age=scan.nextInt();*/
		
		boolean vote=true;
		
		if(age>=18)
		{
			
			System.out.println(vote);
		}
		else
		{
			vote=false;
			System.out.println(vote);
		}
	
	}

	public static void main(String[] args) {
		
		
		
		//VoltingEligibility.eligible();
		VoltingEligibility.eligible(5);
		
		VoltingEligibility.eligible(47);


	}

}

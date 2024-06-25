package inheritanceassignment1;

import java.util.Scanner;

public class ClassA {
	
	int basicpay, deduction, bonus;
	
	public void display()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter basic pay");
		basicpay=scan.nextInt();
		
		System.out.println("Enter deductions");
		deduction=scan.nextInt();
		
		System.out.println("Enter bonus");
		bonus=scan.nextInt();
	
	}
	

}

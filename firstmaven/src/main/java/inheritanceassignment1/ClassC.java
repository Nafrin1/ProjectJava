package inheritanceassignment1;

public class ClassC extends ClassB {
	
	double totalSalary;
	
	public void total()
	{
		
		totalSalary=basicpay+hra-pf-deduction+bonus;
		System.out.println("Total Salary by hand: "+totalSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC show=new ClassC();
		
		show.display();
		show.calc();
		
		System.out.println("Basic pay: "+show.basicpay);
		System.out.println("Deduction: "+show.deduction);
		System.out.println("hra: "+show.hra);
		System.out.println("Pf: "+show.pf);
		System.out.println("Bonus: "+show.bonus);
		
		show.total();
		

	}

}

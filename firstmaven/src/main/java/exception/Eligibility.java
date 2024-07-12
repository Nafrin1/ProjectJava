package exception;

public class Eligibility {
	
	
	public void eligible(int age)
	{
		if(age>=18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			throw new ArithmeticException("You are not eligible");
			//System.out.println("You are not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligibility e=new Eligibility();
		e.eligible(2);

	}

}

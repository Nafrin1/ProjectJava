package exception;

public class ExceptionSample {
	
	int a=10;
	
	public void add()
	{
		try
		{
			int b=a/0;
			System.out.println(b);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception handled" +a);
		}
		finally
		{
			System.out.println("Successfully executed");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample exc=new ExceptionSample();
		exc.add();

	}

}

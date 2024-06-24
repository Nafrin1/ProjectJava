package accessmodifiers;

public class AccessModifiers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers1 print=new AccessModifiers1();
		print.display1();
		print.display2();
		print.display4();
		print.display4();

	}
	
	public void display1()
	{
		System.out.println("This is a public method");
	}
	
	private void display2()
	{
		System.out.println("This is a private method");
	}
	
	protected void display3()
	{
		System.out.println("This is a protected method");
	}
	
	void display4()
	{
		System.out.println("This is default method");
	}


}

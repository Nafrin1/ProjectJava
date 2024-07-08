package abstraction;

public abstract class Abstraction1 {
	
	public Abstraction1()
	{
		System.out.println("Constructors");
	}
	
	public abstract void method();
	
	public static void method1()
	{
		System.out.println("Static method");
		
	}
	
	public void method2()
	{
		System.out.println("Instance method");
	}
	
	public abstract void method3(int a, int b);
	

}

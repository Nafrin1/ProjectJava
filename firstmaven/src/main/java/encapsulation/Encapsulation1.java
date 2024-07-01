package encapsulation;

public class Encapsulation1 {
	
	private int a;
	private int b;
	
	public void setter(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void getter()
	{
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	

}

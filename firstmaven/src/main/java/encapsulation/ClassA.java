package encapsulation;

public class ClassA {
	
	private int pin1;
	private int pin2;
	private int pin3;
	
	public void setter(int pin1, int pin2, int pin3)
	{
		this.pin1=pin1;
		this.pin2=pin2;
		this.pin3=pin3;
	}
	
	public void getter1()
	{
		System.out.println("PIN: "+pin1);
	}
	
	public void getter2()
	{
		System.out.println("PIN: "+pin2);
	}
	
	public void getter3()
	{
		System.out.println("PIN3: "+pin3);
	}

}

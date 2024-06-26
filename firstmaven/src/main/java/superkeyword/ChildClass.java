package superkeyword;

public class ChildClass extends ParentClass {
	
	public ChildClass()
	{
		super.add();
	}
	
	public void divisible()
	{
		if(sum%10==0)
		{
			System.out.println(sum+" is divisble by 10");
		}
		else
		{
			System.out.println(sum+" is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass call=new ChildClass();
		call.divisible();

	}

}

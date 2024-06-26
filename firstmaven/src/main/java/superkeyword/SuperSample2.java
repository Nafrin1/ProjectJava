package superkeyword;

public class SuperSample2 extends SuperSample {
	
	public SuperSample2()
	{
		super();
		System.out.println("constructor");
		super.add();
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperSample2 call=new SuperSample2();
	

	}

}

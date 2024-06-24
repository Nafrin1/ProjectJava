package mullevelinheritence;

public class ClassC extends ClassB {
	
	public void divide()
	{
		int quotient=a/b;
		System.out.println("Quotient: "+quotient);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC call=new ClassC();
		call.add();
		call.subtract();
		call.divide();

	}

}

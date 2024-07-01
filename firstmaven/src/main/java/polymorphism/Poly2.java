package polymorphism;

public class Poly2 extends Poly1 {
	
	public void sample()
	{
		super.sample();
		System.out.println("Child");
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Poly2 call=new Poly2();
		call.sample();
	}

}

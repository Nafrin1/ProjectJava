package interabstract;

public class InterfaceEx1 implements InterfaceEx,InterfaceEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx1 inter=new InterfaceEx1();
		inter.method();
		inter.method2();
		inter.abst();

	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("c: "+c);
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Extra abstract method");
		
	}

	@Override
	public void abst() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance example");
		
	}

}

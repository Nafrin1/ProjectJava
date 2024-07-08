package abstraction;

public class Abstraction2 extends Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction2 abs=new Abstraction2();
		abs.method();
		abs.method2();
		Abstraction1.method1();
		abs.method3(10,200);

	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
		
	}

	@Override
	public void method3(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
		
	}

}

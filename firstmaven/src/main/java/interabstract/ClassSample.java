package interabstract;

public class ClassSample implements InterfaceEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ClassSample cl=new ClassSample();
		cl.method();
		cl.method();
		cl.method2();
		 						OR    */
		    
		InterfaceEx inter=new ClassSample();    //can be used if all methods from one specific interface is to be acceseed
		inter.method();
		inter.method2();

	}

	@Override
	public void method() {
		System.out.println("method from first interface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method from second interface");
		
	}

	@Override
	public void abst() {
		// TODO Auto-generated method stub
		System.out.println("method from second interface");
		
	}

}

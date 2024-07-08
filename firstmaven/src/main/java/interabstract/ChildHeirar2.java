package interabstract;

public class ChildHeirar2 implements ParentHeirar{
	
	static int c=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentHeirar call=new ChildHeirar2();
		call.add();
		call.subtract();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int sum=a+b+c;
		System.out.println("sum: "+sum);
		
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		int subtract=a-b-c;
		System.out.println("difference: "+subtract);
		
	}
	
	

}

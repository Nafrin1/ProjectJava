package interabstract;

public class ChildHeirar1 implements ParentHeirar {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentHeirar call=new ChildHeirar1();
		call.add();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int sum=a+b;
		System.out.println("sum: "+sum);
		
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}

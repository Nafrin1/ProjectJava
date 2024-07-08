package interabstract;

public class MultipleClass implements InterMultiple1, InterMultiple2 {

	static int c;
	static int e;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleClass multi=new MultipleClass();
		multi.add();
		multi.average();

	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		c=a+b;
		System.out.println("sum: "+c);
		
	}
	
	public static void average()
	{
		e=c+d;
		System.out.println("sum2 "+e);
		
	}

}

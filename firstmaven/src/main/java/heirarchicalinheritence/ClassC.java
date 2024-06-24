package heirarchicalinheritence;

public class ClassC extends ClassA {
	
	public void average()
	{
		int avg=sum/2;
		System.out.println("The average is: "+avg);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC call=new ClassC();
		call.add();
		call.average();

	}

}

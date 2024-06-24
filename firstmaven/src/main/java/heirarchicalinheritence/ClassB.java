package heirarchicalinheritence;

public class ClassB extends ClassA {
	
	public void add1()
	{
		int c=10;
		int sum1=a+b+c;
		System.out.println("The sum of three numbers is: "+sum1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB show=new ClassB();
		show.add1();
		

	}

}

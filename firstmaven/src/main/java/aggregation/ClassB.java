package aggregation;


public class ClassB {
	
	String address;
	ClassA cl;
	
	public ClassB(String address, ClassA cl)
	{
		this.address=address;
		this.cl=cl;
	}
	
	public void display()
	{
		System.out.println("name: "+cl.name);
		System.out.println("roll: "+cl.roll);
		System.out.println("address: "+address);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA class1=new ClassA("Nafrin", 2);
		ClassB class2=new ClassB("Kottayam",class1);
		class2.display();
		

	}

}

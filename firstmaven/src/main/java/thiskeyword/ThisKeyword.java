package thiskeyword;

public class ThisKeyword {
	
	int a;
	int b;
	
	public ThisKeyword()
	{
		System.out.println("default");
	}
	
	public ThisKeyword(int a, int b)
	{
		this();       //if construcotr was paarametrised, then values are passed
		
		this.a=a;
		this.b=b;
		
		this.print();
	}
	
	public void print()
	{
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		this.display();   //can be given in constrcutir
		
	}
	
	public void display()
	{
		System.out.println("Hello");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword call=new ThisKeyword(1,2);
		//call.print();
		

	}

}

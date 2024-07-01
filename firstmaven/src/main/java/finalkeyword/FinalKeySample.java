package finalkeyword;

public class FinalKeySample extends FinalKeySample2 {
	final int a=10;
	
	/*public FinalKeySample()
	{
		a=10;
	}*/
	
	public void call()
	{
		//a=10;
		System.out.println("hello");
		
	}
	
	/*public final void display()
	{
		Final methods cannot be overriden 
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeySample show=new FinalKeySample();
		System.out.println(show.a);
		show.call();
		show.display();

	}

}

package interabstract;

public class MultiChild implements MultiParentBird, MultiChildParrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild multi=new MultiChild();
		multi.bird();
		multi.parrot();

	}

	@Override
	public void parrot() {
		// TODO Auto-generated method stub
		System.out.println("My name is Kiki and I am a parrot");
		
	}

	@Override
	public void bird() {
		// TODO Auto-generated method stub
		System.out.println("I am a bird");
		
	}

}

package collection;


import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> object=new HashSet<String>();
		
		object.add("dog");
		object.add("cat");
		object.add("monkey");
		
		System.out.println(object);
		
		System.out.println(object.size());
		
		object.remove(0);
		System.out.println(object);
		
		//System.out.println(object.get(1));

	}

}

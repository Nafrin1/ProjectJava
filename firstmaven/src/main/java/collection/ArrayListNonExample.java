package collection;

import java.util.ArrayList;

public class ArrayListNonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList object=new ArrayList();
		
		object.add("A");
		object.add("B");
		object.add("C");
		object.add("D");
		
		System.out.println(object);
		
		System.out.println(object.size());
		
		String value=(String) object.remove(3);
		System.out.println("Removed value is: "+value);
		System.out.println(object);
		
		System.out.println(object.get(0));
		
		ArrayList object1=new ArrayList();
		object1.add("E");
		object1.add("F");
		object1.add("G");
		object1.add(1);
		
		object.addAll(object1);
		System.out.println(object);
		
		object.add(2);
		System.out.println(object);
		
		

	}

}

package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> object=new ArrayList<Integer>();
		
		object.add(2);
		object.add(34);
		object.add(45);
		object.add(50);
		object.add(60);
		
		System.out.println(object);
		
		object.remove(2);
		System.out.println(object);
		
		System.out.println(object.size());
		
		System.out.println(object.get(2));
		
		//System.out.println(object.removeAll(object));
		
		//object.removeAll(object);
		//System.out.println(object);
		
		
		ArrayList<Integer> obj=new ArrayList<Integer>();
		
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		System.out.println(obj);
		
		obj.addAll(object);
		System.out.println(obj);

	}

}

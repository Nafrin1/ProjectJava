package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<Integer> object=new LinkedList<Integer>();
		
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
		
		
		LinkedList<Integer> obj=new LinkedList<Integer>();
		
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

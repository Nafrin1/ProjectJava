package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		for(int x:list)
		{
			System.out.println(x);
		}
		
		Iterator i= list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}

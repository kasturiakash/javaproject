package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("welcome");
		al.add(10);
		al.add(10.456);
		al.add('c');
		System.out.println(al);
		al.add(2,"training"); //2describes after no of elents not position
		System.out.println(al);
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al);


		
		
		}

}

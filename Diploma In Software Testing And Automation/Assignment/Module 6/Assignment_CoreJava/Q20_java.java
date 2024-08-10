package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Q20_java {

	public static void main(String[] args) {
		List<String>list_String = new ArrayList<String>();
		list_String.add("tiger");
		list_String.add("elephant");
		list_String.add("fox");
		list_String.add("monkey");
		list_String.add("bull");
	 
		System.out.println(list_String);
		list_String.set(3, "cow");
		
		System.out.println(list_String);

	}

}

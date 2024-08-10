package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Q21_java {

	public static void main(String[] args) {
		List<String>list_Strings = new ArrayList<String>();
		  list_Strings.add("elephant");
		  list_Strings.add("tiger");
		  list_Strings.add("lion");
		  list_Strings.add("cow");
		  list_Strings.add("buffalo");
		  
		  System.out.println(list_Strings);
		   
		  list_Strings.remove(4);
		  
		  System.out.println("After removing fourth element from the list:\n"+list_Strings);

	}

}

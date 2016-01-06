import java.util.*;                                          // line 10
class ArrayListUsage{                                        // line 11
	public static void main(String [] args) {                // line 12
		List<String> list = new ArrayList<String>(2);        // line 13 ArrayList(int initialCapacity) Constructs an empty list with the specified initial capacity.
		System.out.print(list.size() + " ");                 // line 14
		list.clear();                                        // line 15
		System.out.print(list.size() + " ");                 // line 16
		list.add("Hey!");                                    // line 17
		list.add("Howdy!!");                                 // line 18
		list.add(2, "Hello!!!");                             // line 19
		if (list.contains("Hello!!!"))                       // line 20
		   System.out.print(list.indexOf("Hello!!!") + " "); // line 21
		System.out.print(list.get(2));                       // line 22
	}                                                        // line 23
}                                                            // line 24

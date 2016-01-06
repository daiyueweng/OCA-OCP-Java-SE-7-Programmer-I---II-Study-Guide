import java.util.*;
class Sorter{
	public static void main(String [] args) {
		ArrayList<String> sa = new ArrayList<String>();
		sa.add("a"); sa.add("b"); sa.add("c");
		String sb[] = new String[3];            // line x
		for (int x = 1; x < sa.size(); x++)
		   sb[x] = sa.get(x);	                // line y
		for (String s: sb)                      // line z
		   System.out.print(s + " ");
	}	
}

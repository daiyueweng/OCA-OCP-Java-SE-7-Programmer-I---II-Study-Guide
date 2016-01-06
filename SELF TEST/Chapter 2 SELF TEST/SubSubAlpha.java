class Alpha { 								  // line 3
	static String s = " "; 					  // line 4
	protected Alpha() { s += "alpha "; } 	  // line 5
} 											  // line 6
class SubAlpha extends Alpha { 				  // line 7
	private SubAlpha() { s += "sub "; } 	  // line 8
} 											  // line 9
public class SubSubAlpha extends Alpha { 	  // line 10
	private SubSubAlpha() { s += "subsub "; } // line 11
											  // SubSubAlpha extends Alpha
	public static void main(String[] args) {  // line 12
		new SubSubAlpha(); 					  // line 13
		System.out.println(s); 				  // line 14
	} 										  // line 15
} 											  // line 16
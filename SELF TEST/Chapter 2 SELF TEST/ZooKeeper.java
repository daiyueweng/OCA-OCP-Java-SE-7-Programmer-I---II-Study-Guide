class Mammal { 														 // line 3
	String name = "furry "; 										 // line 4
	String makeNoise() { return "generic noise"; } 					 // line 5
} 																	 // line 6
class Zebra extends Mammal { 										 // line 7
	String name = "stripes "; 										 // line 8
	String makeNoise() { return "bray"; } 							 // line 9
} 																	 // line 10
public class ZooKeeper { 											 // line 11
	public static void main(String[] args) { new ZooKeeper().go(); } // line 12
	void go() { 													 // line 13
		Mammal m = new Zebra(); 									 // line 14
		System.out.println(m.name + m.makeNoise()); 				 // line 15
																	 // Polymorphism is only for instance methods
																	 // Zebra overrided makeNoise() in Mammal
	} 																 // line 16
} 																	 // line 17
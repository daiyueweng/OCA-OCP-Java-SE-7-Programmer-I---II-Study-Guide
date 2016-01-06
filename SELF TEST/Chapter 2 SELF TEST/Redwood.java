public class Redwood extends Tree { 			  // line 3
	public static void main(String[] args) {      // line 4
		new Redwood().go(); 					  // line 5
	} 											  // line 6
	void go() { 								  // line 7
		go2(new Tree(), new Redwood()); 		  // line 8
		go2((Redwood) new Tree(), new Redwood()); // line 9
	} 											  // line 10
	void go2(Tree t1, Redwood r1) { 			  // line 11
		Redwood r2 = (Redwood)t1; 				  // line 12
												  // A ClassCastException will be thrown
												  // Tree cannot be downcast to Redwood
												  // t1 is not referring to a Redwood object
		Tree t2 = (Tree)r1; 					  // line 13
	} 											  // line 14
} 												  // line 15
class Tree { } 									  // line 16
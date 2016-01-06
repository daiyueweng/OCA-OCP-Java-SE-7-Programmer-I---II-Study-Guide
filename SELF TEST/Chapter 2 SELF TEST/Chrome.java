class X { void do1() { } }
class Y extends X { void do2() { } }

class Chrome {
	public static void main(String [] args) {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		// insert code here
		((Y)x2).do2(); // choice C, correct
		(Y)x2.do2();   // choice B, incorrect since without
					   // the second set of parentheses,
					   // the compiler thinks it's not a statement

} }
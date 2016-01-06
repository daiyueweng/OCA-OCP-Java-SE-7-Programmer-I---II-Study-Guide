class Input {
	public static void main(String [] args) {
		String s = "-";
		try {
			doMath(args[0]);
			s += "t "; // line 6 is never reached
		}
		finally { System.out.println(s += "f "); }
	}
	public static void doMath(String a) {
		int y = 7 / Integer.parseInt(a);
	}
}
// java Input 
// ArrayIndexOutOfBound exception

// java Input 0
// ArithmeticException for the attempt to divide by zero 
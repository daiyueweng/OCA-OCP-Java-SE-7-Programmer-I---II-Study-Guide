class Elway {
	public static void main(String [] a) {
		if (a.length == 0) System.exit(0);
		try {
			final int x = Integer.parseInt(a[0]);  // assume x now = 32
			final int y = new Elway().go(x);
			System.out.println(go(y)); // the invocation of go() is made from a static method
		} catch (Exception x) {
			System.out.println("parse boo boo");
		}
	}
	int go(int z) { return z++; } // go is marked as a static method
}
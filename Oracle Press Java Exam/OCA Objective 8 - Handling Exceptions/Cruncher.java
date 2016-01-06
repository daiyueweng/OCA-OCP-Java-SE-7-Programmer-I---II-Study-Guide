class Cruncher {
	int sum;
	public static void main(String [] args) {
		int y = 7;
		String s = y + "z";
		new Cruncher().go(Integer.parseInt(args[0]));
	}
	int go(int x) {
		sum += x;
		if (x == 0) {
			System.out.println("Sum: " + sum);
			return sum;
		}
		return go(--x); // recursive invocations of go() can cause StackOverflowError
	}
}
// assume that Integer.parseInt(args[0]) will return a valid integer
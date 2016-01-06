class Jumps {
	public static void main(String [] args) {
		Wooper w = new Wooper();
		System.out.print(w.jump(5) + " ");
		w.printJumps(5);
	}
}
class Wooper {
	public int jump(int i) {
		System.out.print(printJumps(i++) + " "); return i;
	}
	private int printJumps(int i) { // printJumps is private, it is not visible outside Wooper
		System.out.print("Jump: " + i++ + " "); return i;
	}
}
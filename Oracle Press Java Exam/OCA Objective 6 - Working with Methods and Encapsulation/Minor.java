class Uber {
	static int y = 2;
	Uber(int x) { this(); y = y * 2; }
	Uber() { y++; }
}
class Minor extends Uber {
	Minor() { super(y); y = y + 3; } // an explicit call to Uber's one-arg constructor
	public static void main(String [] args) {
		new Minor();
		System.out.println(y);
	}
}
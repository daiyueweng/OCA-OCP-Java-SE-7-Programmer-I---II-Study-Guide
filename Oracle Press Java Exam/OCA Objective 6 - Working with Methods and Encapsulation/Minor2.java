class Uber2 {
	static int y = 2;
	Uber2(int x) { this(); y*= 2; } // Uber does not have a no-arg constructor
}
class Minor2 extends Uber2{
	Minor2() { super(y); y += 3; }
	public static void main(String [] args) {
		new Minor2();
		System.out.println(y);
	}
}
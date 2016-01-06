class Parrot {
	void chirp(int loud) {
		System.out.print("CHRIP ");
	}
}
class Parrotlet extends Parrot {
	void chirp(long loud) {
		System.out.print("chrip ");
	}
	public static void main(String [] args) {
		Parrotlet bokeh = new Parrotlet();
		bokeh.chirp(420);
		bokeh.chirp(123_456_789_012); // the argument must be declared as a long: 123_456_789_012L
	}
}
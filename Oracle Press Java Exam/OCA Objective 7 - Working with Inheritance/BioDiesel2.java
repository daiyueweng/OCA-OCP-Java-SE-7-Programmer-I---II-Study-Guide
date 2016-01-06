class Fuel{
	int getRating() { return 41; }
}
class AlternativeFuel extends Fuel{
	int getRating() { return 42; }
}
class BioDiesel2 extends AlternativeFuel{
	public static void main(String [] args) {
		new BioDiesel2().go();
	}
	void go(){
		System.out.println(super.getRating());       // #1
		System.out.println(super.super.getRating()); // #2 super cannot be used to access a parent's parent
	}
}
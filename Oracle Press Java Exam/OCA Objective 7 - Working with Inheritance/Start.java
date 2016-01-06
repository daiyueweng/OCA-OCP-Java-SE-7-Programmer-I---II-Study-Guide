interface Breakable { public void breakSmoothly(); }
class Car { public void accelerate() {} }
class FancyCar extends Car { public void breakSmoothly() {} }
class SuperFancyCar extends FancyCar implements Breakable {
	public void breakSmoothly() {}
	public void turn() {}
}
class Start{
	public static void main(String [] args) { print(new FancyCar()); }
	private static void print(Car car){
		// Insert code here
		((Breakable) car).breakSmoothly();     // F1 compiles, but throws ClassCastException in runtime
		((SuperFancyCar) car).turn();          // F2 compiles, but throws ClassCastException in runtime
		((SuperFancyCar) car).breakSmoothly(); // F3 compiles, but throws ClassCastException in runtime
		((FancyCar) car).turn();               // F4 FancyCar does not have turn method
		((FancyCar) car).breakSmoothly();      // F5 FancyCar has breakSmoothly method
		car.accelerate();                      // F6 Car has accelerate method
		car.turn();                            // F7 Car does not have turn method
		car.breakSmoothly();                   // F8 Car does not have breakSmoothly method
	}
}
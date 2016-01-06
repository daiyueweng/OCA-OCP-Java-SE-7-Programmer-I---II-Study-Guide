interface Flyer{
	void printWingspan();
	void fly(); // compiles if removed
}
abstract class Bird implements Flyer{
	public void fly() { }
	public void waddle() { } // compiles if removed
}
class Hawk extends Bird{
	public void printWingspan() { }
}
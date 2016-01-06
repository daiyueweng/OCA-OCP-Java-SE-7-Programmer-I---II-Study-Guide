// Invoking a Superclass Version of an Overridden Method
public class Animal2{
	public void eat(){
	}
	public void printYourself(){
		// Useful printing code goes here
	}
}
class Horse extends Animal2{
	public void printYourself(){
		// Take advantage of Animal code, then add some more
		super.printYourself();	// Invoke the superclass
                            	// (Animal) code
                            	// Then do Horse-specific
                            	// print work here
	}
}
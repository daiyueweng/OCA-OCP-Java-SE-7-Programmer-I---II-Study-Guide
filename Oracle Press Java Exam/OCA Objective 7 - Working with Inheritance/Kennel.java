class Dog{ }
class Beagle extends Dog{ }

class Kennel{
	public static void main(String [] args) {
		Beagle b1 = new Beagle();
		Dog dog1 = new Dog();
		Dog dog2 = b1;
		// insert code here
		Beagle b2 = (Beagle) dog1; // will throw ClassCastException at runtime, dog1 refers to a Dog object
		Beagle b3 = (Beagle) dog2;
		Beagle b4 = dog2; // superclass needs to be casted in order to assign to a subclass
	}
}
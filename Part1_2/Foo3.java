// Constructor Basics
class Foo3{
	int size;
	String name;

//	Overloaded Constructors
	Foo3(){
	} // The constructor for the Foo class

	Foo3(String name, int size){
		this.name=name;
		this.size=size;
	}

	public static void main (String[] args) {
		Foo3 f1 = new Foo3(); // Won't compile, if there is no matching constructor
		Foo3 f2 = new Foo3("Fred",43); // No problem. Arguments match
                              		// the Foo constructor.
    }
}
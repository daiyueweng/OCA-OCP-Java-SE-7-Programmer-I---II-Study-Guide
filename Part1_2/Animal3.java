// Overridden Methods
// exam watch
class Animal3{
	public void eat() throws Exception{
		// throws an Exception
	}
}
class Dog2 extends Animal3{
	public void eat(){
		// no Exceptions
	}
	public static void main (String[] args) {
		Animal3 a = new Dog2();
		Dog2 d = new Dog2();
		d.eat(); // ok
		a.eat(); // compiler error
                 // unreported exception
    }
}
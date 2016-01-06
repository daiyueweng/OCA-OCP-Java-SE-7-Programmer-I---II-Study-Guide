public class A{
	public void say() { System.out.print("Hey! "); }
}
class B extends A{
	public void say(String name) { System.out.print("Hello, " + name); } // overloads method say in A
}
class C extends A{}
class Start{
	public static void main(String [] args) {
		// Insert code here
		B b = new B();
		b.say();
		b.say("John Lennon");
	}
}
//A b = new A(); // b refers to object of A, does not have say(String name) method
//A b = new B(); // the reference type of b is A, cannot invoke say(String name) method
//A b = new C(); // the reference type of b is A, cannot invoke say(String name) method
//B b = new A(); // invalid assignment, needs to cast new A() to (B)(new A())
//B b = new C(); // invalid assignment, b cannot refer to objects of C, since b is of type B
//C b = new C(); // class C does not have say(String) method
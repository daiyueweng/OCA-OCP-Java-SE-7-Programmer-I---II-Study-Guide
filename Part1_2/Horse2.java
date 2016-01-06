// Polymorphism in Overloaded and Overridden Methods

public class Horse2 extends Animal{
	public void eat(){
		System.out.println ("Horse eating hay ");
	}
	public void eat(String s){
		System.out.println ("Horse eating " + s);
	}
	public static void main (String[] args) {
		Animal a = new Animal();
		a.eat();
		Horse2 h = new Horse2();
		h.eat();
		Animal ah= new Horse2();
		ah.eat();
		Horse2 he= new Horse2();
		he.eat("Apples");
	//	Animal a2=new Animal();
	//	a2.eat("treats"); // Compiler error! Compiler sees that the Animal doesn't have
						  // eat(String s) method.
	//	Animal ah2=new Horse2();
	//	ah2.eat("Carrots"); // Compiler error! Compiler looks at the reference and sees
							// that Animal doesn't have an eat(String s).
							// It doesn't care that the actual object might be a Horse2 at runtime.
    }
}
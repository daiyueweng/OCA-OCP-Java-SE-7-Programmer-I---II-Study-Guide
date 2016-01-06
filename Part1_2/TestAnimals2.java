public class TestAnimals2{
	public static void main (String[] args) {
		Animal a = new Animal();
		Animal b = new Horse(); // Animal ref, but a Horse object
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()
				 // If compiles - but it doesn't, meltdown at runtime!
    }
}
class Animal{
	public void eat(){
		System.out.println ("Generic Animal Eating Generically");
	}
}
class Horse extends Animal{
	private void eat(){ // whoa! - it's private!
		System.out.println ("Horse eating hay, oats, "
                       		+ "and horse treats");
	}
}
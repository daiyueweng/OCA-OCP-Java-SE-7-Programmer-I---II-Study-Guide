public class TestAnimals{
	public static void main (String[] args) {
		Animal a = new Animal();
		Animal b = new Horse(); // Animal ref, but a Horse object
		Animal c = new Horse();
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()
				 // Meltdown at runtime if invoking private eat()!
    	c.buck(); // Can't invoke buck();
           		  // Animal class doesn't have that method
    }
}
class Animal{
	public void eat(){
		System.out.println ("Generic Animal Eating Generically");
	}
	/*
	private void eat(){ // whoa! - it's private!
		System.out.println ("Horse eating hay, oats, "
                       		+ "and horse treats");
	}*/
}
class Horse extends Animal{
	public void eat(){
		System.out.println ("Horse eating hay, oats, "
							+ "and horse treats");
	}
	public void buck(){
	}
}
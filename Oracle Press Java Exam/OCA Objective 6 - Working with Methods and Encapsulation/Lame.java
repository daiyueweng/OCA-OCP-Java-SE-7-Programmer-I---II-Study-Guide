import lamentation.Lamentable;

public class Lame implements Lamentable {
	void lament() { // lament in Lamentable is implicitly public, the lament in Lame must be declared public in order not to have more restrictive access than the overriden method in Lamentable
		System.out.println("Man, this class is lame.");
	}
	
	void lament(int n) {
		System.out.println("How lame is this class? Let me count the ways: " + n);
		}
		
		int lament(){ // it is not legal to have multiple methods with the same signature
			System.out.println("Really, really lame.");
		}
		
		private void lament() { // line 12 and 16 are not legal method overrides of the method in Lamentable
			System.out.println("Seriously, why whould you ever use this class?");
		}
}
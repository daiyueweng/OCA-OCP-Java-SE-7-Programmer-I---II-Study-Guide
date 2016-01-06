class Feline {
	String name;
	Feline(String n) { // Feline does not have a no-arg constructor, super() from Kitty will generate compilation errors
		name = " " + n + " ";
	} 
}
public class Kitty extends Feline {
	String name = "kitty";
	Kitty(String n) { // make a call to super() first, and then pass a String
		name = n;
	}
	public static void main(String [] args) {
		Kitty k = new Kitty("Niki");
		System.out.println(k.name);
	}
}
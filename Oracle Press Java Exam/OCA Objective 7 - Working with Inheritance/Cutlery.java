class Cutlery{ }
class Fork extends Cutlery{
	public static void main(String [] args) {
		Cutlery c1 = new Fork();
		Fork f1 = new Fork();
		Cutlery c2 = c1;
		Cutlery c3 = f1;
		Fork f2 = c1; // superclass needs to be casted, in order to assign to a subclass
		Fork f3 = f1;
	}
}
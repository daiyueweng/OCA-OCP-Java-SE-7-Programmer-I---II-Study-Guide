public class Xmen extends Heroes{
	public static void main(String [] args) {
		new Xmen();
		System.out.println(s);
	}
	Xmen(){ s += "x "; }
}
class Heroes{
	static String s = "-";
	Heroes(){
		s += "h1 ";
		this(1); // this statement must be the 1st statement of the constructor
	}
	Heroes(int x){ s += "h2 "; }
}
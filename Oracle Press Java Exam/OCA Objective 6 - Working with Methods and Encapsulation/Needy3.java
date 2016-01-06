import xcom.*; // line 1
class Needy3 {
	public static void main(String [] args) {
		xcom.Useful u = new xcom.Useful(); // line 2
		System.out.println(u.increment(5)); // increment must be marked public to be accessed outside of the xcom package
	}
}
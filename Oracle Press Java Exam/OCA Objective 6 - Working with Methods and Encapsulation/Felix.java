public class Felix {
	protected long cat() {
		return 7L;
	}
}
class Oscar extends Felix {
	// insert code here
	//private long cat(int x) { return 7; }  // valid overload
	//public long cat() { return 8L; }       // valid override
	long cat(){ return 8; }                // default access is more restrictive than protected
	//protected int cat(int x) { return 7; } // valid overload
}
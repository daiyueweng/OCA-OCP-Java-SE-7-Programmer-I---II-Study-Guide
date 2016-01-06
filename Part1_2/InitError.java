//Initialization Blocks
class InitError{
	static int [] x = new int[4];
	static {
		x[4] = 5; // bad array index!
	}
	public static void main(String[] args) {

    }
}
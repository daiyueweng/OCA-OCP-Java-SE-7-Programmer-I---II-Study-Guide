//Static Variables and Methods
//exam watch

class Foo4{
	int x = 3;
	float y = 4.3f;
	public static void main(String[] args) {
    	System.out.println("x is " + x);
    	for (int z = x; z < ++x; z--, y = y + z)
    	// complicated looping and branching code
    }
}
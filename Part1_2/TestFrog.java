//Accessing Static Methods and Variables

class Frog{
	static int frogCount = 0; // Declare and initialize
                              // static variable
    public Frog(){
    	frogCount += 1;		  // Modify the value in the constructor
    }
}

class TestFrog{
	public static void main(String[] args) {
    	new Frog();
    	new Frog();
    	new Frog();
    	Frog f = new Frog();
    	int frogs = f.frogCount; // Access static variable
                         		 // FrogCount using f
    	System.out.println("frogCount:" + Frog.frogCount); // Access
                                                   		   // static variable
		System.out.println("frogCount:" + frogs);
    }
}
class Foo{
	protected short test(float [] y){ return 3; }
}

class SubFoo extends Foo{
	//public test(float [] y){ return 7; } // it doesn't have a return type, hence it is an invalid method
	public int test(float x){ return 7; } // overloads test method
	//public long test (float [] y){ return 7; } // only changes the return type, it is not an overload nor an override method 
	//short test(float [] x){ return 7; } // the access level is more restrictive than the overridden method
	private short test(float x){ return 7; } // overloads test method
	protected short test(float [] yahoo){ return 7; } // overrides the test method
}
// Overloaded Constructors
class A{
	A(){
		this("foo");
	}
	A(String s){
		this();
	}

	public void go(){
		doStuff();
	}

	public void doStuff(){
		go();
	}
}
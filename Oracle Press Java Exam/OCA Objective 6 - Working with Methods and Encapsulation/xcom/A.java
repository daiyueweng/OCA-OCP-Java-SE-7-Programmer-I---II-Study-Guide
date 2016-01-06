package xcom;
public class A{
	// insert code here
	//void go() { System.out.println("a.go"); }           // default access is visible in the same class or package
	public void go() { System.out.println("a.go"); }    // public access allows code from outside package xcom to access methods in B
	//private void go() { System.out.println("a.go"); }   // private access is visible in the same class
	//protected void go() { System.out.println("a.go"); } // protected access is visible in the same class, package or subclass
}
//Chapter 6 SELF TEST Question 13
public class Gotcha{
	public static void main(String [] args) {
		// insert code here 
		// I, II, III all compiled, only II completes normally 
		//new Gotcha().go();       // I
		try { new Gotcha().go(); } // II
		catch (Error e) { System.out.println("ouch"); }
		//try { new Gotcha().go(); } // III
		//catch (Exception e) { System.out.println("ouch"); }		
	}
	void go(){
		go();
	}
}

public class MyProgram2 {
	public static void throwit() {
		throw new RuntimeException();
	}
	public static void main(String [] args) {
		try {
			System.out.println("Hello World ");
			throwit(); // main does not handle RuntimeException, the finally block is executed before the exception is propagated 
			System.out.println("Done with try block ");
		}
		finally {
			System.out.println("Finally executing ");
		}
	}
}
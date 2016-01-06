public class MyProgram {
	public static void main(String [] args) {
		try { // either a catch or a finally statement must follow a try
			System.out.print("Hello World ");
		}
		finally {
			System.out.println("Finally executing ");
		}
	}
}
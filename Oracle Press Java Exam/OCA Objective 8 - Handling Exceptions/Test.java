public class Test {
	public static void main(String [] args) {
		try {
			m1();
			m2();
		} catch (Exception e1) {
			System.out.print(" except ");
		}
	}
	
	static void m1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e2) {
			System.out.print("m1catch ");
		}
	}
	static void m2() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.print(" m2finally ");
		}
	}
}
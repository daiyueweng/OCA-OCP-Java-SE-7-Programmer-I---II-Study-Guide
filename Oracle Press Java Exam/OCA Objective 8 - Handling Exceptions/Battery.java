class Battery {
	static int x = 1;
	public static void main(String [] args) throws Throwable {
		try {
			if (x == 1) throw new Throwable();
			System.out.println("try ");
		} catch (Exception e) { // Throwable is not a subclass of Exception, catch does not catch Throwable
			System.out.println("exc ");
		} finally {
			System.out.println("fin ");
		}
	}
}
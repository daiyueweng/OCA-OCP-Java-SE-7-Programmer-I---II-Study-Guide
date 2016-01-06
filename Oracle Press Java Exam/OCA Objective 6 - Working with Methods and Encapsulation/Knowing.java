class Knowing {
	static final long tooth = 343L; // are not changed
	static long doIt(long tooth) {  // parameter tooth is not marked as final and can change
		System.out.print(++tooth + " ");
		return ++tooth;
	}
	public static void main(String [] args) {
		System.out.print(tooth + " ");
		final long tooth = 340L;    // are not changed
		new Knowing().doIt(tooth);  // pass a copy of tooth value to doIt()
		System.out.println(tooth);
	}
}
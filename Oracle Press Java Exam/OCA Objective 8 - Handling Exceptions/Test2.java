class Test2 {
	public static void main(String [] args) {
		System.out.print("Start ");
		try {
			System.out.print("Hello World ");
			throw new FileNotFoundException();
		}
		System.out.print("Catch Here "); // the only legal statements follow try blocks are either catch or finally statement 
		catch(FileNotFoundException e) {
			System.out.print("File not found");
		}
	}
}
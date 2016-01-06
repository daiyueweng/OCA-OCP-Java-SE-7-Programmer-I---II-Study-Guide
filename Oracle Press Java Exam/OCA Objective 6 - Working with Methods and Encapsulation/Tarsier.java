class Tarsier{
	static String s = "-";
	public static void main(String [] args) {
		go();
		System.out.println(s);
	}
	void go() { s+="s"; } // go method is declared twice with the same signature
	{ go(); }
	static { go(); }
	static void go() { s+="s"; }
}
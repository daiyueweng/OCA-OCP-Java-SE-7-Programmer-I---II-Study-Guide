class Scope{
	public static void main(String [] args) {
		int x = 2;                               // line 11
		for (int y = 2; y > 0; y--){             // line 12
			System.out.print(x + " " + y + " "); // line 13
			x++;                                 // line 14
		}                                        // line 15
		System.out.println(x + " " + y);         // line 16 y is out of scope
	}
}

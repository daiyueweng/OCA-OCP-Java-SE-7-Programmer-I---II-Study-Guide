//Chapter 6 SELF TEST 14
class Test14{
	public static void main(String [] args)
	{
		String s = "bob";
		String[] sa = {"a","bob"};
		final String s2 = "bob";
		StringBuilder sb = new StringBuilder("bob");
		
		//switch (sa[1]) {         // line 1
		//switch ("b" + "ob") {    // line 2
		switch (sb.toString()) { // line 3	
			case "ann": ;        // line 4
			//case s: ;            // line 5 compile time constant string required for case 
			case s2: ;           // line 6
		}
	}	
}

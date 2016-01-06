class Ping extends Utils {
	public static void main(String [] args) /*throws Exception*/{
		Utils u = new Ping();
	//	try {
		System.out.print(u.getInt(args[0]));
	/*	} catch (Exception ex) {
			System.out.print("caught ");
		}*/
	}
	int getInt(String a) {
		return Integer.parseInt(a); // note: parseInt() can throw an Exception
	}
}
class Utils {
	int getInt(String x) throws Exception { return 7; }
}
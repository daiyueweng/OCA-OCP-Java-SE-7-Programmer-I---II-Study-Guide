import java.io.*;
class Master {
	String doFileStuff() throws FileNotFoundException { return "a"; }
}
class Slave extends Master {
	public static void main(String [] args) {
		String s = null;
		try { s = new Slave().doFileStuff();
		} catch (Exception x) {
		s = "b"; }
		System.out.println(s);
	}
	// insert code here
	String doFileStuff() { return "b"; }                              // A
	String doFileStuff() throws IOException { return "b"; }           // B the overriding method cannot throw a broader exception
	String doFileStuff(int x) throws IOException { return "b"; }      // C it is a overload method of doFileStuff in Master, the ouput is "a"
	String doFileStuff() throws FileNotFoundException { return "b"; } // D
	String doFileStuff() throws NumberFormatException { return "b"; } // E
	String doFileStuff() throws NumberFormatException,
								FileNotFoundException { return "b"; } // F
}
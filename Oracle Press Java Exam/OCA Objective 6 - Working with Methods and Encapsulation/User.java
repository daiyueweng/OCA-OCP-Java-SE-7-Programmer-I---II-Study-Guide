import static xcom.Stuff.*;
import static java.lang.System.out;
class User {
	public static void main(String [] args) {
		new User().go();
	}
	void go() { out.println(doStuff(MY_CONSTANT)); } // static members in Stuff are not public, User cannot see them
}
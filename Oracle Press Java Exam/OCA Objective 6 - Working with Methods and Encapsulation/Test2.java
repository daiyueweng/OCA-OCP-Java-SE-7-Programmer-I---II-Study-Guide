public class Test2 {
	public static void main(String [] args) {
		Test2 t = new Test2();
		t.start();
	}
	void start() {
		String s1 = "one";
		String s2 = alter(s1); // start's s1 and alter's s1 refer to the same String object
		System.out.println(s1 + " " + s2);
	}
	String alter(String s1) {
		s1 = s1 + " two"; // when the concatenation occurs, a new object is created and assigned to alter's s1
		System.out.print(s1 + " ");
		return "three"; // a String object "three" is created and returned, referred to by s2 in start
	}
}
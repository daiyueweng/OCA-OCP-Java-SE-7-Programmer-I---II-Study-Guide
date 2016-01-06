public class SuperJuice {
	public int calculateJuice(int seed) { // this is not a static method
		return (int)(Math.random() * seed)
	}
	public static void main(String [] args) {
		System.out.println("" + calculateJuice(1024));
	}
}

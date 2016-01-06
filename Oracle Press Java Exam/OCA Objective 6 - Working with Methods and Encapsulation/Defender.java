class Alien {
	String invade(short ships) { return "a few"; }
	String invade(short... ships){ return "many"; } // a var-arg method is only chosen if a fixed argument is not available
}
class Defender {
	public static void main(String [] args) {
		System.out.println(new Alien().invade((short)7));
	}
}
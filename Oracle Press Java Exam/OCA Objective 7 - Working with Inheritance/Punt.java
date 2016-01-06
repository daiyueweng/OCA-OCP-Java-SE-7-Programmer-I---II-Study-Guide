class Punt{
	public static void main(String [] args) {
		Punt p = new Punt();
		Object o = p.go(new Punt()); // arrays are objects
		Punt[] p2 = (Punt[])o; // the case is valid
		System.out.println(p.equals(p2[0]) + " " + (p == p2[0])); // 'equals' and '==' works the same way in Object, if two refs point to the same object, return true, otherwise false
	}
	Punt[] go(Punt p){
		Punt[] p2 = {p};
		return p2;
	}
}
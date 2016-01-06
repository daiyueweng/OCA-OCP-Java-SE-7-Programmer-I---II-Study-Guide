// Overloaded Constructors
public class Animal4{
	String name;
	Animal4(String name){
		this.name=name;
	}

	Animal4(){
		this(makeRandomName());
	}

	static String makeRandomName(){
		int x=(int)(Math.random()*5);
		String name=new String[]{"Fluffy","Fido",
								 "Rover","Spike",
								 "Gigi"}[x];
		return name;
	}

	public static void main (String[] args) {
    	Animal4 a=new Animal4();
    	System.out.println(a.name);
		Animal4 b=new Animal4("Zeus");
		System.out.println (b.name);
    }
}
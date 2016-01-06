//Accessing Static Methods and Variables
class Frog2{
	int frogSize = 0;
	public int getFrogSize(){
		return frogSize;
	}
	public Frog2(int s){
		frogSize = s;
	}
	public static void main(String[] args) {
    	Frog2 f = new Frog2(25);
    	System.out.println(f.getFrogSize()); // Access instance
                                         	 // method using f
    }
}
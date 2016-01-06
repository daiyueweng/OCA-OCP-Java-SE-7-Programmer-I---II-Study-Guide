class Hat { }
class BaseballCap extends Hat { }
class Bonet extends Hat { }
class HatTest{
	public static void main(String [] args) {
		Hat h1 = new BaseballCap();
		Hat h2 = new Bonet();
		//Bonet bo1 = new BaseballCap(); // BaseballCap and Bonet do not have any inheritance relationship 
		//BaseballCap ba1 = new Bonet();
		//BaseballCap ba2 = new Hat();   // cannot assign a superclass to a subclass
		//Bonet bo2 = new Hat();
	}
}
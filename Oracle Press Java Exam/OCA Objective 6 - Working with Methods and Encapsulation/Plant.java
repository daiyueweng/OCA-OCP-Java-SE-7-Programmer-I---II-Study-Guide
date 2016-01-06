class Plant {
	String getName() { return "plant"; }
	Plant getType() { return this; }
}
class Flower extends Plant {
	// insert code here
	Flower getType() { return this; }       // covariant return 
	//String getType() { return "this"; }   // String is not a subtype of Plant
	Plant getType() { return this;}         // the return type can be the same as the return type of the overriden method
	Tulip getType() { return new Tulip(); } // covariant return 
}
class Tulip extends Flower { }
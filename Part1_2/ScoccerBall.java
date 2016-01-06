abstract class Ball3 implements Bounceable{
	public void bounce(){
	} // Define bounce behavior
	public void setBounceFactor(int bf){
		// Don't implement the rest; leave it for a subclass
	}
}
class ScoccerBall extends Ball3{ // class SoccerBall must
                                 // implement the interface
                                 // methods that Ball didn't
	public void moveIt(){
	}
	public void doSphericalThing(){
	}
	// SoccerBall can choose to override the Bounceable methods
  	// implemented by Ball
	public void Bounce(){
	}
}
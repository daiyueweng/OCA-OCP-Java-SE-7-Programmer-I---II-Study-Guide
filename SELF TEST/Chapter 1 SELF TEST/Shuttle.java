// Chapter 1 SELF TEST Question 2

class Rocket {
    private void blastOff() { System.out.print("bang "); }
    // public void blastOff() { System.out.print("bang "); }
}

public class Shuttle extends Rocket {
    
    public static void main(String[] args) {
        new Shuttle().go();
    }
  
    void go() {
        blastOff();
        // Rocket.blastOff();  // line A Rocket blastOff() is a non-static method
                               // static methods are invoked with the class name, 
                               // no need for creating an instance of the class
    }
  
    private void blastOff() { System.out.print("sh-bang "); }
}
// Chapter 3 SELF TEST Question 11

class Beta { }                                          // line 3
class Alpha {                                           // line 4
    static Beta b1;                                     // line 5
    Beta b2;                                            // line 6
}                                                       // line 7
public class Tester {                                   // line 8
    public static void main(String[] args) {            // line 9
        Beta b1 = new Beta(); Beta b2 = new Beta();     // line 10
        Alpha a1 = new Alpha(); Alpha a2 = new Alpha(); // line 11
        a1.b1 = b1;                                     // line 12 static Beta b1 still holds the reference to the object referenced by b1 
        a1.b2 = b1;                                     // line 13 
        a2.b2 = b2;                                     // line 14 a2.b1 also holds the reference to the object referenced by b1
        a1 = null; b1 = null; b2 = null;                // line 15
        // do stuff                                     // line 16
    }                                                   // line 17
}                                                       // line 18
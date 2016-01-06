// Chapter 3 SELF TEST Question 8

public class Ouch {                          // line 3
    static int ouch = 7;                     // line 4
    public static void main(String[] args) { // line 5
        new Ouch().go(ouch);                 // line 6
        System.out.print(" " + ouch);        // line 7
    }                                        // line 8
    void go(int ouch) {                      // line 9
        ouch++;                              // line 10
        for(int ouch = 3; ouch < 6; ouch++)  // line 11 variable ouch is already defined in method go(int)
            ;                                // line 12
        System.out.print(" " + ouch);        // line 13
    }                                        // line 14
}                                            // line 15
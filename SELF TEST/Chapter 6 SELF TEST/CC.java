// Chapter 6 SELF TEST Question 7
class SubException extends Exception { }                            // line 3
class SubSubException extends SubException { }                      // line 4
                                                                    // line 5
public class CC { void doStuff() throws SubException { } }          // line 6
                                                                    // line 7
class CC2 extends CC { void doStuff() throws SubSubException { } }  // line 8
                                                                    // line 9
class CC3 extends CC { void doStuff() throws Exception { } }        // line 10 overriding method can't throw a broader exception than the overridden method 
                                                                    // line 11
class CC4 extends CC { void doStuff(int x) throws Exception { } }   // line 12
                                                                    // line 13  
class CC5 extends CC { void doStuff() { } }                         // line 14
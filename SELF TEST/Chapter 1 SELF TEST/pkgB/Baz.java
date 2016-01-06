// Chapter 1 SELF TEST Question 5

package pkgB;

import pkgA.*;

public class Baz {
    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.print(" " + f.a);
        System.out.print(" " + f.b);
        System.out.println(" " + f.c);
 }
}
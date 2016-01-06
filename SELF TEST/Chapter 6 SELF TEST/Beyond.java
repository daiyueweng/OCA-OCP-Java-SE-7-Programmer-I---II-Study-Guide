// Chapter 6 SELF TEST Question 9
class Infinity { }
public class Beyond extends Infinity {
    static Integer i;
    public static void main(String[] args) {
        int sw = (int)(Math.random() * 3);
        switch(sw) {
            case 0: { for(int x = 10; x > 5; x++)   // Case 0 will initiate an endless loop, not a stack overflow
                    if(x > 10000000) x = 10;
                    break; }
            case 1: { int y = 7 * i; break; }       // i was not initialized, case 1 will throw a NullPointerException
            case 2: { Infinity inf = new Beyond();  // Case 2's downcast will not cause an exception
                    Beyond b = (Beyond)inf; }
        }
    }   
}
// Chapter 5 SELF TEST Question 3

public class Actors {
    public static void main(String[] args) {
        char[] ca = {0x4e, \u004e, 78}; // The Unicode declaration must be enclosed in single quotes: '\u004e'
        System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));
    }
}
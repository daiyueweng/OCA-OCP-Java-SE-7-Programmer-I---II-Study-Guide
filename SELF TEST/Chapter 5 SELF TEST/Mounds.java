// Chapter 5 SELF TEST Question 9

public class Mounds {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = new String();
        for(int i = 0; i < 1000; i++) {
            s = " " + i;    // every String concatenation operation results in a new String object
            sb.append(s);
        }
        // done with loop
    }
}
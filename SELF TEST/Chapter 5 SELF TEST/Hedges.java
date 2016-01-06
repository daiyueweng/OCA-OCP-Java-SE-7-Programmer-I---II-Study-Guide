// Chapter 5 SELF TEST Question 11

public class Hedges {
    public static void main(String[] args) {
        String s = "JAVA";
        s = s + "rocks";
        s = s.substring(4,8);
        s.toUpperCase();    // toUpperCase() makes a new String object but is instantly lost
        System.out.println(s);
    }
}
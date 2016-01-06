public class Thousands{
    public static void main (String[] args) {
        int a = 1_000; // underscore is only for readability
        String b = "1_000";
        int c = a + a;
        String d = a + b; // a is treated as characters
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
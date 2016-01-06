public class Doubles{
    public static void main (String[] args) {
        // insert code here
        // double d = 1234.56;
        double d = _1234.56;      // '_' cannot be at the beginning or end of a literal
        // double d = 1_234.56;
        // double d = 1_234_.56;  // '_' cannot immediately preceded the decimal point
        // double d = 1_234_56;   // it prints 123456.0
        // double d = 0_1234.5_6;
        // double d = 0_1234._56; // '_' cannot immediately follow the decimal point
        System.out.println(d);
    }
}
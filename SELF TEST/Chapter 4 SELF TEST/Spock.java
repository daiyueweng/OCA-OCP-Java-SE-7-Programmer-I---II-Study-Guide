// Chapter 4 SELF TEST Question 4
// || && prevented count from being incremented
public class Spock {
    public static void main(String[] args) {
        int mask = 0;
        int count = 0;
        if( ((5<7) || (++count < 10)) | mask++ < 10 ) mask = mask + 1;
        if( (6 > 8) ^ false) mask = mask + 10;
        if( !(mask > 1) && ++count > 1) mask = mask + 100;
        System.out.println(mask + " " + count);
    }
}
// Chapter 1 SELF TEST Question 11

// import static java.lang; // the same as below
// import static java.lang.Integer; // the static import declaration imports static members from classes
import static java.lang.Integer.*; // correct
// static import java.lang.Integer.*; // the syntax is import static
// import static java.lang.Integer.MAX_VALUE; // correct

class StatTest {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
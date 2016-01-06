// Chapter 6 SELF TEST Question 5
class Loopy {
    public static void main(String[] args) {
        int[] x = {7,6,5,4,3,2,1};
        // insert code here
        // for(int y : x) {                                     // A compiles
        // for(x : int y) {                                     // B doesn't compile, operands swapped
        // int y = 0; for(y : x) {                              // C enhanced for must declare its first operand
        // for(int y=0, z=0; z<x.length; z++) { y = x[z];       // D compiles
        // for(int y=0, int z=0; z<x.length; z++) { y = x[z];   // E doesn't compile, incorrect syntax to declare two variables in for statement
        int y = 0; for(int z=0; z<x.length; z++) { y = x[z];    // F compiles
            System.out.print(y + " ");
        }
    }
}
// Chapter 5 SELF TEST Question 4

class Dims {                                 // line 1
    public static void main(String[] args) { // line 2
        int[][] a = {{1,2}, {3,4}};          // line 3
        int[] b = (int[]) a[1];              // line 4
        Object o1 = a;                       // line 5
        int[][] a2 = (int[][]) o1;           // line 6
        int[] b2 = (int[]) o1;               // line 7 A ClassCastException is thrown, since o1 refers to an int[][], not an int[]
        System.out.println(b[1]);            // line 8
} }                                          // line 9
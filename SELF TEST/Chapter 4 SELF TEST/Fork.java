// Chapter 4 SELF TEST Questoin 3

class Fork {
    public static void main(String[] args) {
        if(args.length == 1 | args[1].equals("test")) { // ArrayIndexOutOfBoundsException on args array
            System.out.println("test case");
        } else {
            System.out.println("production " + args[0]);
        }
    }
}
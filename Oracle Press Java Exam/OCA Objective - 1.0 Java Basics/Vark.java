class Vark{
    public static void main (String... a) {
        new Vark().go(a, 42);
    }
    void go(String[] b, int life){
        System.out.println(b[1]);
    }
}
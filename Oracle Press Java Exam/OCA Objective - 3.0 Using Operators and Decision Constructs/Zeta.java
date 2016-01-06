class Zeta{
    public static void main (String[] args) {
        int x = 1;
        if((4 > x) ^ ((++x + 2) > 3)) x++; // '^' - EOR 
        if((4 > ++x) ^ !(++x == 5)) x++;
        System.out.print(x);
    }
}
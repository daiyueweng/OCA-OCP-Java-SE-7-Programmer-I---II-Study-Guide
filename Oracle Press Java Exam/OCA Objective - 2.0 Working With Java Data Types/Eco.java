class Eco{
    public static void main (String[] args) {
        Eco e1 = new Eco();
        Eco e2 = new Eco();
        Eco e3 = new Eco();
        e3.e = e2;
        e1.e = e3;
        e2 = null; // e2 set to null
        e3 = null;
        e2.e = e1; // null pointer exception on e2
        e1 = null;
    }
    Eco e;
}
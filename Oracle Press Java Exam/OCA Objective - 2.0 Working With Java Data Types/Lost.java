class Lost{
    public static void main (String[] args) {
        Lost e1 = new Lost();
        Lost e2 = new Lost();
        Lost e3 = new Lost();
        e3.e = e2;
        e1.e = e3;
        e2.e = e1;
        e3 = null;
        e2 = null;
        e1 = null;
    }
    Lost e;
}
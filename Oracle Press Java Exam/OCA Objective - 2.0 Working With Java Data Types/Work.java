class Yup{
    private static int x = 4; private final int y = 5;
    public int getX(){return x;}
    public void setX(int x){this.x = x;}
    public int getY(){return y;}
    public void setY(int y){this.y = y;} // cannot assign a value to final variable y
}

class Work{
    public static void main (String[] args) {
        Yup y = new Yup();
        y.setX(8);
        y.setY(10);
        System.out.print(y.getX() + y.getY());
    }
}
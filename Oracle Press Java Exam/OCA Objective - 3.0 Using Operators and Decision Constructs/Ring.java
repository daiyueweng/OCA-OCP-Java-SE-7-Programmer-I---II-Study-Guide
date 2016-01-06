class Ring{
    final static int x2 = 7;
    final static Integer x4 = 8;
    public static void main (String[] args) {
        Integer x1 = 5;
        String s = "a";
        if(x1 < 9) s += "b";
        switch(x1){
            case 5: s += "c";
            case x2: s += "d";
            case x4: s += "e"; // case expressions need to be constant 
        }
        System.out.println(s);
    }
}
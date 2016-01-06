class Swill{
    enum TimeZone {EST, CST, MST, PST};
    public static void main (String[] args) {
        String s = "-";
        switch(TimeZone.CST){
            case EST: s += "e";
            case CST: s += "c";
            case MST: s += "m";
            default: s += "X";
            case PST: s += "p";
        }
        System.out.println(s);
    }
}
public class Suitcase{
    private int id;
    
    public Suitcase(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Suitcase other = (Suitcase)obj;
        return id == other.id;
    }
    public static void main (String[] args) {
        Suitcase a = new Suitcase(1);
        Suitcase b = new Suitcase(1);
        Suitcase c = b;
        String result = "-";
        if(a == b) result += "1";
        if(b == c) result += "2";
        b = c;
        if(a.equals(b)) result += "3";
        if(b.equals(c)) result += "4";
        System.out.println(result);
    }   }
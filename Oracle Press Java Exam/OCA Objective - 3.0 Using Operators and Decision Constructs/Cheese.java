public class Cheese{
    public static void main (String[] args) {
        String a = "string cheese";
        String b = new String("string cheese");
        String c = "swiss";
        int d = 5;
        int e = 5;
        String result = "-";
        if(a==b) result += "1";
        if(b==c) result += "2";
        b=c;
        if(d==e) result += "3";
        if(b==c) result += "4";
        System.out.println(result);
    }
}
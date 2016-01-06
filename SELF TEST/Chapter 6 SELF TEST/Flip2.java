// Chapter 6 SELF TEST Question 4
public class Flip2 {
    public static void main(String[] args) {
        String o = "-";
        String[] sa = new String[4]; // sa array has 4 String objects
        for(int i = 0; i < args.length; i++)
        sa[i] = args[i];
        for(String n: sa) {
            switch(n.toLowerCase()) { // sa array received 3 arguments from the command line 
                case "yellow": o += "y";
                case "red": o += "r";
                case "green": o += "g";
            }
        }
        System.out.print(o);
    }
}
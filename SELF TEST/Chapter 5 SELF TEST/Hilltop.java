// Chapter 5 SELF TEST Question 2

public class Hilltop {
    public static void main(String[] args) {
        String[] horses = new String[5];
        horses[4] = null;
        for(int i = 0; i < horses.length; i++) {
            if(i < args.length)
                horses[i] = args[i];
            System.out.print(horses[i].toUpperCase() + " "); // java.lang.NullPointerException on horses[4] since it is null
        }
    }
}
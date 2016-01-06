
class Beekeeper{
    public static void main (String[] args) {
        String d = "beekeeper";
        d.substring(1,7);
        d = "w" + d;
        d.insert(3,"bee"); // insert() is a StringBuilder method, cannot be used on a String object
        System.out.println(d);
    }
}
// Chapter 1 SELF TEST Question 4

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals(String s) { sound = s; }
}

class TestEnum {
    static Animals a;
    public static void main(String[] args) { // A common use for static methods is to access static fields
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}
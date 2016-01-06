class Animals{
    public static void main (String[] args) {
        String word = "quack";
        switch(word){
            case "roof": {
                System.out.print("Sounds like a dog!"); break;
            }case "mew": {
                System.out.print("Sounds like a cat!"); break;
            }case "tweet": {
                System.out.print("Sounds like a bird!"); break;
            }case else: { // no "case else" case
                System.out.print("It's another animal...");
            }
        }
    }
}
class Equality{
    private String word;
    Equality(String word){this.word = word;}
    public static void main (String[] args) {
        Equality e1 = new Equality("howdy");
        Equality e2 = new Equality("howdy");
        if(e1.equals(e2)) System.out.print(e1 == e2);
    }
    public String getWord(){return word;}
    public boolean equals(Object o){
        if(((Equality)o).getWord() == word){
            System.out.print("Equals!"); return true;
        }else{System.out.print("Equals...not! "); return false;}
    }
}